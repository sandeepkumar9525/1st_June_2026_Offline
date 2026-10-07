package com.kodewala.ecommerce.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kodewala.ecommerce.model.CartItem;

public class CartRepository {

	Map<Integer, List<CartItem>> carts = new HashMap<>();

	public List<CartItem> getCart(int customerId) {
		return carts.computeIfAbsent(customerId, id -> new ArrayList<>());
	}

	public void clearCart(int customerId) {
		carts.remove(customerId);
	}

	public boolean hasCart(int customerId) {
		return carts.containsKey(customerId);
	}

}
