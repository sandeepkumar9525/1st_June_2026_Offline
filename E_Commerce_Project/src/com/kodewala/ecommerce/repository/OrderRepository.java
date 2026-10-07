package com.kodewala.ecommerce.repository;

import java.util.ArrayList;
import java.util.List;

import com.kodewala.ecommerce.model.Order;

public class OrderRepository {
	List<Order> orders = new ArrayList<Order>();

	public void addOrder(Order order) {
		orders.add(order);
	}

	public List<Order> getAllOrders() {
		return orders;
	}

}
