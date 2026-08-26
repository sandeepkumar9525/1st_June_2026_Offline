package com.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class Product {
	// instance variable
	int id;

	// paramertizeds constructor
	public Product(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {

	return obj instanceof Product && id == ((Product) obj).id;

	}

	@Override
	public int hashCode() {
		return 100;

	}

	public static void main(String[] args) {
		 Set<Product> set = new HashSet<>();
		 
		// Product p = new Product(10);
		 set.add(new Product(1));
		 set.add(new Product(2));
		 System.out.println(set.size());
	}

}
