package com.compare1;

import java.util.Comparator;

public class CustomerByIDComparator implements Comparator<Customer> {

	

	@Override
	public int compare(Customer c1, Customer c2) {
		
		return Integer.compare(c1.id, c2.id);
	}

	

	

}
