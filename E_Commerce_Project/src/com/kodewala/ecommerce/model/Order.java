package com.kodewala.ecommerce.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
	private int orderId;
	private int customerId;
	private List<CartItem> cartItems;
	private double totalAmount;
	private String orderStatus;
	private LocalDateTime orderDate;

	public Order(int orderId, int customerId, List<CartItem> cartItems, double totalAmount, String orderStatus,
			LocalDateTime orderDate) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.cartItems = cartItems;
		this.totalAmount = totalAmount;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order{" + "orderId=" + orderId + ", customerId=" + customerId + ", cartItems=" + cartItems
				+ ", totalAmount=" + totalAmount + ", orderStatus='" + orderStatus + '\'' + ", orderDate=" + orderDate
				+ '}';
	}

}
