package com.kodewala.ecommerce.main;

import java.util.List;
import java.util.Scanner;

import com.kodewala.ecommerce.exception.CustomerNotFountException;
import com.kodewala.ecommerce.exception.InsufficientStockException;
import com.kodewala.ecommerce.exception.InvalidOrderException;
import com.kodewala.ecommerce.exception.InvalidQuantityException;
import com.kodewala.ecommerce.model.Customer;
import com.kodewala.ecommerce.model.Order;
import com.kodewala.ecommerce.model.Product;
import com.kodewala.ecommerce.repository.CartRepository;
import com.kodewala.ecommerce.repository.CustomerRepository;
import com.kodewala.ecommerce.repository.OrderRepository;
import com.kodewala.ecommerce.repository.ProductRepository;
import com.kodewala.ecommerce.service.CartService;
import com.kodewala.ecommerce.service.CustomerService;
import com.kodewala.ecommerce.service.OrderService;
import com.kodewala.ecommerce.service.ProductService;

public class EcommerceApplication {
	
	private static ProductService productService;
	private static CustomerService customerService;
	private static CartService cartService;
	private static OrderService orderService;
	 private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Repositories
		ProductRepository productRepository = new ProductRepository();

		CustomerRepository customerRepository = new CustomerRepository();

		CartRepository cartRepository = new CartRepository();

		OrderRepository orderRepository = new OrderRepository();

		// Services
		productService = new ProductService(productRepository);

		customerService = new CustomerService(customerRepository);

		cartService = new CartService(cartRepository, productService);

		orderService = new OrderService(orderRepository, cartService, productService, customerService);
		mainMenu();
	}

	private static void mainMenu() {
		while (true) {
			System.out.println("===== E-COMMERCE SYSTEM=====");
			System.out.println("1.Admin ");
			System.out.println("2.Customer");
			System.out.println("3.Exit");
			System.out.println("Enter choice");
			

			int choice = sc.nextInt();
			sc.nextLine();
			try {

				switch (choice) {
				case 1:
					adminMenu();
					break;
				case 2:
					customerMenu();
					break;
				case 3:
					System.out.println("Thank ypu for using E-Commerce System.");
					sc.close();
					return;
				default:
					System.out.println("Invalid choice");
				}
			} catch (Exception e) {
				System.out.println("Error :" + e);
			}
		}
	}

	private static void adminMenu() {
		boolean login  = true;
		while (login ) {
			System.out.println("=====ADMIN MENU=======");
			System.out.println("1.Add Product");
			System.out.println("2.View Products");
			System.out.println("3.Search Product");
			System.out.println("4.Update product");
			System.out.println("5.Delete Product");
			System.out.println("6.View Customer");
			System.out.println("7.View All Order");
			System.out.println("8.Exit");

			
			System.out.println("Enter Choice :");

			int choice = sc.nextInt();
			sc.nextLine();
			try {
				switch (choice) {
				case 1:
					addProduct();
					break;
				case 2:
					viewProducts();
					break;
				case 3:
					searchProduct();
					break;
				case 4:
					updateProduct();
					break;
				case 5:
					deleteProduct();
					break;
				case 6:
					viewcustomers();
					break;
				case 7:
					orderService.viewAllOrders();
					break;
				case 8:
					login = false;
					break;
				default:
					System.out.println("Invalid choice");

				}
			} catch (Exception e) {
				System.out.println("Error : " + e);
			}

		}
	}

	// =================ADD PRODUCTS=============
	private static void addProduct() throws InvalidQuantityException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Id:");
		int productId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter product Name");
		String productName = sc.nextLine();

		System.out.println("Enter Category");
		String category = sc.nextLine();

		System.out.println("Enter Price");
		double price = sc.nextDouble();

		System.out.println("Enter Quantity");
		int quantity = sc.nextInt();
		sc.nextLine();

		System.out.println("Etner Brand");
		String brand = sc.nextLine();

		Product product = new Product(productId, productName, category, price, quantity, brand);

		productService.addProduct(product);
	}

	// =================VIEW PRODUCTS=============

	private static void viewProducts() {

		List<Product> products = productService.getAllProducts();

		if (products.isEmpty()) {
			System.out.println("No products available");
			return;
		}

		for (Product product : products) {
			System.out.println(product);
		}
	}

	// ================= SEARCH PRODUCT =================

	private static void searchProduct() {

	    System.out.println("1.Search By Id");
	    System.out.println("2.Search By Name ");
	    System.out.println("3.Search By Category");
	    System.out.println("4.Search By Brand");
	    System.out.println("5.Search By Price Range");

	    int choice = sc.nextInt();
	    sc.nextLine();   // IMPORTANT

	    switch (choice) {

	    case 1:
	        System.out.println("Enter product Id ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        System.out.println(productService.getProductById(id));
	        break;

	    case 2:
	        System.out.println("Enter Product Name");

	        String name = sc.nextLine();

	        productService.searchByName(name)
	                .forEach(System.out::println);

	        break;

	    case 3:
	        System.out.println("Enter Category");

	        String category = sc.nextLine();

	        productService.searchByCategory(category)
	                .forEach(System.out::println);

	        break;

	    case 4:
	        System.out.println("Enter Brand");

	        String brand = sc.nextLine();

	        productService.searchByBrand(brand)
	                .forEach(System.out::println);

	        break;

	    case 5:
	        System.out.print("Enter Minimum Price: ");

	        double min = sc.nextDouble();

	        System.out.print("Enter Maximum Price: ");

	        double max = sc.nextDouble();
	        sc.nextLine();

	        productService.searchByPriceRange(min, max)
	                .forEach(System.out::println);

	        break;

	    default:
	        System.out.println("Invalid choice.");
	    }
	}

	// ================= UPDATE PRODUCT =================
	private static void updateProduct() throws InvalidQuantityException {
		System.out.println("\n1. Update Price");
		System.out.println("2. Update Quantity");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter choice: ");

		int choice = sc.nextInt();
		switch (choice) {

		case 1:

			System.out.print("Enter Product ID: ");

			int id = sc.nextInt();

			System.out.print("Enter New Price: ");

			double price = sc.nextDouble();

			productService.updatePrice(id, price);

			break;

		case 2:

			System.out.print("Enter Product ID: ");

			int productId = sc.nextInt();

			System.out.print("Enter New Quantity: ");

			int quantity = sc.nextInt();

			productService.updateQuantity(productId, quantity);
			break;

		default:

			System.out.println("Invalid choice.");
		}
	}

	// =================DELETE PRODUCT =================
	private static void deleteProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product ID: ");

		int prodcuctId = sc.nextInt();

		productService.deleteProduct(prodcuctId);
	}
	// ================= VIEW CUSTOMERS =================

	private static void viewcustomers() {

		List<Customer> customers = customerService.getAllCustomer();

		if (customers.isEmpty()) {
			System.out.println("No Customer Registered");
			return;
		}
		for (Customer customer : customers) {
			System.out.println(customer);

		}

	}

	// ================= CUSTOMER MENU =================

	private static void customerMenu() {
		while (true) {

			System.out.println("\n========== CUSTOMER MENU ==========");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. View Products");
			System.out.println("4. Search Product");
			System.out.println("5. Add Product to Cart");
			System.out.println("6. View Cart");
			System.out.println("7. Remove Product from Cart");
			System.out.println("8. Place Order");
			System.out.println("9. View My Orders");
			System.out.println("10. Cancel Order");
			System.out.println("11. Logout");

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter choice: ");

			int choice = sc.nextInt();
			sc.nextLine();

			try {
				switch (choice) {
				case 1:
					registerCustomer();
					break;
				case 2:
					loginCustomer();
					break;
				case 3:
					viewProducts();
					break;

				case 4:
					searchProduct();
					break;

				case 5:
					addProductToCart();
					break;
				case 6:
					viewCart();
					break;

				case 7:
					removeProductFromCart();
					break;

				case 8:
					placeOrder();
					break;

				case 9:
					viewMyOrders();
					break;

				case 10:
					cancelOrder();
					break;
				case 11:
					return;

				default:
					System.out.println("Invalid choice.");
				}

			} catch (Exception e) {
				System.out.println("Error:" + e.getMessage());
			}
		}

	}

	// ================= REGISTER =================

	private static void registerCustomer() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Cusomer ID:");

		int CustomerId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Custmoer Name:");
		String name = sc.nextLine();

		System.out.println("Enter Email:");
		String email = sc.nextLine();

		System.out.println("Enter Mobile Number :");
		String mobile = sc.nextLine();

		System.out.println("Enter Address");
		String address = sc.nextLine();

		Customer customer = new Customer(CustomerId, name, email, mobile, address);
		customerService.registerCustomer(customer);

	}

	// ================= LOGIN =================
	private static void loginCustomer() throws CustomerNotFountException {

	    System.out.println("Enter Customer ID");

	    int customerId = sc.nextInt();
	    sc.nextLine();

	    Customer customer = customerService.getCustomerById(customerId);

	    System.out.println("Welcome: " + customer.getName() + "!");
	}

	// ================= ADD TO CART =================
	private static void addProductToCart()
	        throws InsufficientStockException, InvalidQuantityException {

	    System.out.print("Enter Customer ID: ");
	    int customerId = sc.nextInt();
	    sc.nextLine();

	    System.out.print("Enter Product ID: ");
	    int productId = sc.nextInt();
	    sc.nextLine();

	    System.out.print("Enter Quantity: ");
	    int quantity = sc.nextInt();
	    sc.nextLine();

	    cartService.addProductToCart(customerId, productId, quantity);

	    System.out.println("Product added to cart successfully.");
	}

	// ================= VIEW CART =================
	private static void viewCart() {
		
		System.out.println("Enter Customer ID");
		int customerId = sc.nextInt();
		sc.nextLine();
		cartService.viewCart(customerId);

	}

	// ================= REMOVE FROM CART =================
	private static void removeProductFromCart() {
	
		System.out.println("Enter Customer ID");
		int customerId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Product ID");
		int poductId = sc.nextInt();
		sc.nextLine();

		cartService.removeFromCart(customerId, poductId);

	}

	// ================= PLACE ORDER =================

	private static void placeOrder()
			throws InvalidOrderException, CustomerNotFountException, InsufficientStockException {
		
		System.out.println("Enter Customer ID:");
		int customerId = sc.nextInt();
		sc.nextLine();

		Order order = orderService.placeOrder(customerId);
		System.out.println("Order Detalis:");
		System.out.println(order);

	}
	// ================= VIEW MY ORDERS =================

	private static void viewMyOrders() throws CustomerNotFountException {
	
		System.out.println("Enter Customer ID:");
		int customerId = sc.nextInt();
		sc.nextLine();
		orderService.viewCustomerOrders(customerId);

	}

	// ================= CANCEL ORDER =================

	private static void cancelOrder() throws InvalidOrderException {
		
		System.out.println("Enter Customer ID :");
		int customerId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Order ID:");
		int orderId = sc.nextInt();
		sc.nextLine();

		orderService.cancelOrder(customerId, orderId);
	}

}
