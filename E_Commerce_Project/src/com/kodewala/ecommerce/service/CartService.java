package com.kodewala.ecommerce.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kodewala.ecommerce.exception.InsufficientStockException;
import com.kodewala.ecommerce.exception.InvalidQuantityException;
import com.kodewala.ecommerce.exception.ProductNotFoundException;
import com.kodewala.ecommerce.model.CartItem;
import com.kodewala.ecommerce.model.Product;
import com.kodewala.ecommerce.repository.CartRepository;

public class CartService {
	CartRepository cartRepository;
	ProductService productService;

	Map<Integer, List<CartItem>> customerCarts = new HashMap<>();

	public CartService(CartRepository cartRepository, ProductService productService) {
		this.cartRepository = cartRepository;
		this.productService = productService;
	}

	// Get Customer Cart
	public List<CartItem> getCart(int customerId) {
		return cartRepository.getCart(customerId);
	}

	

	// Add Product To Cart
	public void addProductToCart(int customerId, int productId, int quantity)
			throws InsufficientStockException, InvalidQuantityException {

		// Check quantity
		if (quantity <= 0) {
			throw new InvalidQuantityException("Quantity must be greater than zero");
		}

		// Find product
		Product product = productService.getProductById(productId);

		// Check stock
		if (quantity > product.getQuantity()) {
			throw new InsufficientStockException("Only " + product.getQuantity() + " items are available");
		}

		// Get customer's cart
		List<CartItem> cart = cartRepository.getCart(customerId);

		CartItem existingItem = null;

		// Check whether product already exists in cart
		for (CartItem item : cart) {

			if (item.getProductId() == productId) {
				existingItem = item;
				break;
			}
		}

		// If product already exists
		if (existingItem != null) {

			int newQuantity = existingItem.getQuantity() + quantity;

			// Check stock again
			if (newQuantity > product.getQuantity()) {
				throw new InsufficientStockException("Requested quantity exceeds available stock");
			}

			existingItem.setQuantity(newQuantity);

			// Update total price
			existingItem.setTotalPrice(product.getPrice() * newQuantity);

		} else {

			// Calculate total price using customer's quantity
			double totalPrice = product.getPrice() * quantity;

			CartItem cartItem = new CartItem(product.getProductId(), product.getProductName(), product.getPrice(),
					quantity, totalPrice);

			cart.add(cartItem);
		}

		System.out.println("Product added to cart successfully.");
	}

	// Decrease Quantity
	// Decrease Quantity
	public void decreaseQuantity(int customerId, int productId) {

		List<CartItem> cart = cartRepository.getCart(customerId);

		for (CartItem item : cart) {

			if (item.getProductId() == productId) {

				if (item.getQuantity() <= 1) {

					cart.remove(item);
					System.out.println("Product removed from cart");

				} else {

					int newQuantity = item.getQuantity() - 1;
					item.setQuantity(newQuantity);

					item.setTotalPrice(item.getPrice() * newQuantity);

					System.out.println("Quantity decreased.");
				}

				return;
			}
		}

		throw new IllegalArgumentException("Product is not available in the cart");
	}

	// View Cart
	public void viewCart(int customerId) {

		List<CartItem> cart = getCart(customerId);

		if (cart.isEmpty()) {
			System.out.println("Cart is empty.");
			return;
		}

		for (CartItem item : cart) {
			System.out.println(item);
		}
		System.out.println("Total Cart value : " + calculateCartTotal(customerId));

	}

	double calculateCartTotal(int customerId) {

		return getCart(customerId).stream().mapToDouble(CartItem::getTotalPrice).sum();
	}

	// Clear Cart
	public void clearCart(int customerId) {
		cartRepository.clearCart(customerId);
		System.out.println("cart cleared Successfully.");
	}

	public void removeFromCart(int customerId, int productId) {

		List<CartItem> cart = cartRepository.getCart(customerId);

		boolean removed = cart.removeIf(item -> item.getProductId() == productId);

		if (!removed) {
			throw new IllegalArgumentException("Product is not available in the cart");
		}

		System.out.println("Product removed from cart");
	}

}
