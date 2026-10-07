package com.kodewala.ecommerce.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.kodewala.ecommerce.model.Customer;

public class CustomerRepository {
	Map<Integer, Customer> customers = new HashMap<>();

	public void addCustomer(Customer customer) {
		customers.put(customer.getCustomerId(), customer);

	}

	public Customer findById(int customerId) {
		return customers.get(customerId);
	}

	public Map<Integer, Customer> getAllCustomer() {
		return customers;
	}

}
