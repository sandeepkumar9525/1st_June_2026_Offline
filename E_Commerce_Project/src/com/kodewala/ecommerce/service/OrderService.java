package com.kodewala.ecommerce.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.kodewala.ecommerce.exception.CustomerNotFoundException;
import com.kodewala.ecommerce.exception.CustomerNotFountException;
import com.kodewala.ecommerce.exception.InsufficientStockException;
import com.kodewala.ecommerce.exception.InvalidOrderException;
import com.kodewala.ecommerce.model.CartItem;
import com.kodewala.ecommerce.model.Order;
import com.kodewala.ecommerce.model.Product;
import com.kodewala.ecommerce.repository.CartRepository;
import com.kodewala.ecommerce.repository.OrderRepository;

public class OrderService {

	OrderRepository orderRepository;
	CartService cartService;
	ProductService productService;
	CustomerService customerService;

	private int olderIdCounter = 1000;

	public OrderService(OrderRepository orderRepository, CartService cartService, ProductService productService,
			CustomerService customerService) {
		super();
		this.orderRepository = orderRepository;
		this.cartService = cartService;
		this.productService = productService;
		this.customerService = customerService;

	}

	// Place Order
	public Order placeOrder(int customerId)
			throws InvalidOrderException, CustomerNotFountException, InsufficientStockException {

		// // Check customer
		customerService.getCustomerById(customerId);

		// Get cart
		List<CartItem> cart = cartService.getCart(customerId);

		// Check empty cart
		if (cart.isEmpty()) {
			throw new InvalidOrderException("Cannot place order . cart is empty");
		}

		// Check stock again before placing order
		for (CartItem item : cart) {
			Product product = productService.getProductById(item.getProductId());

			if (item.getQuantity() > product.getQuantity()) {
				throw new InsufficientStockException("Insufficient stock for product:" + product.getProductName());
			}

		}
		
		// Reduce product quantity
		for (CartItem item : cart) {

		    Product product = productService.getProductById(item.getProductId());

		    product.setQuantity(
		            product.getQuantity() - item.getQuantity()
		    );
		}
		


		// Calculate total
		double totalAmount = cartService.calculateCartTotal(customerId);

		List<CartItem> orderItem = new ArrayList<CartItem>();

		for (CartItem item : cart) {
		    orderItem.add(new CartItem(
		        item.getProductId(),
		        item.getProductName(),
		        item.getPrice(),
		        item.getQuantity(),
		        item.getPrice() * item.getQuantity()
		    ));
		}

		int orderId = ++olderIdCounter;
		// Create Order
		Order order = new Order(orderId, customerId, orderItem, totalAmount, "PLACED", LocalDateTime.now());

		// Save order
		orderRepository.addOrder(order);

		// Clear cart
		cartService.clearCart(customerId);
		System.out.println("order place successfull");
		System.out.println("order ID : " + orderId);
		return order;

	}

	// Get Order By ID

	public Order getOrderById(int orderId) throws InvalidOrderException {
		for (Order order : orderRepository.getAllOrders()) {
			if (order.getOrderId() == orderId) {
				return order;
			}
		}
		throw new InvalidOrderException("order with ID: " + orderId + "does not exite");
	}

	// View Order Details
	public void viewOrderDetails(int orderId) throws InvalidOrderException {

		Order order = getOrderById(orderId);

		System.out.println(order);
	}

	// Get All Orders Of Customer
	public List<Order> getCustomerOrders(int customerId) throws CustomerNotFountException {

		// Make sure customer exists
		customerService.getCustomerById(customerId);

		return orderRepository.getAllOrders().stream().filter(order -> order.getCustomerId() == customerId)
				.collect(Collectors.toList());
	}

	// View Customer Orders
	public void viewCustomerOrders(int customerId) throws CustomerNotFountException {

		List<Order> orders = getCustomerOrders(customerId);

		if (orders.isEmpty()) {
			System.out.println("No orders found for this customer.");
			return;
		}

		for (Order order : orders) {
			System.out.println(order);
		}
	}

	// Cancel Order
	public void cancelOrder(int customerId, int orderId) throws InvalidOrderException {

		Order order = getOrderById(orderId);

		if (order.getCustomerId() != customerId) {

			throw new InvalidOrderException("This order does not belong to this customer.");
		}

		if ("CANCELLED".equals(order.getOrderStatus())) {

			throw new InvalidOrderException("Order is already cancelled.");
		}

		if ("DELIVERED".equals(order.getOrderStatus())) {

			throw new InvalidOrderException("Delivered order cannot be cancelled.");
		}

		order.setOrderStatus("CANCELLED");

		System.out.println("Order cancelled successfully.");
	}

	// View All Orders - Admin
	public List<Order> getAllOrders() {

		return orderRepository.getAllOrders();
	}

	// View All Orders - Admin
	public void viewAllOrders() {

		List<Order> orders = orderRepository.getAllOrders();

		if (orders.isEmpty()) {

			System.out.println("No orders available.");

			return;
		}

		for (Order order : orders) {
			System.out.println(order);
		}
	}

}
