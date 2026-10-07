package com.kodewala.ecommerce.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.kodewala.ecommerce.exception.CustomerNotFountException;
import com.kodewala.ecommerce.model.Customer;
import com.kodewala.ecommerce.repository.CustomerRepository;

public class CustomerService {
	CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	// Register Customer
	 public void registerCustomer(Customer customer) {
	        customerRepository.addCustomer(customer);
	        System.out.println("Customer registered successfully.");
	    }

	// Search Customer By ID
	public Customer getCustomerById(int customerId) throws CustomerNotFountException {

		Customer customer = customerRepository.findById(customerId);

		if (customer == null) {
			throw new CustomerNotFountException("Customer with ID" + customerId + "does not exit");
		}
		return customer;
	}

	// View All Customers
	public List<Customer> getAllCustomer() {
		return new ArrayList<>(customerRepository.getAllCustomer().values());
	}

	// Update Address
	public void updateAddress(int customerId, String newAddress) throws CustomerNotFountException {
		Customer customer = getCustomerById(customerId);
		customer.setAddress(newAddress);
		System.out.println("Customer address update successfull");

	}

	// View Customer Details
	public void viewCustomerDetails(int customerId) throws CustomerNotFountException {
		Customer customer = getCustomerById(customerId);
		System.out.println(customer);
	}

	

}
