package com.treeset;

import java.util.TreeSet;

public class Product implements Comparable<Product> {
	private int productId;
	private String name;
	private double price;
	private String status;

	public Product(int productId, String name, double price, String status) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.status = status;

	}

	

		// sort by price
	@Override
	public int compareTo(Product p) {
		if (this.price < p.price)
			return 0 - 1;
		else if (this.price > p.price) 
			return 1;
			
		else 
			 return Integer.compare(this.productId, p.productId);
		}
		@Override
		public String toString() {
			return productId + " " + name + " " + price + " " + status;
		}
		
		
	}
class ProductApp{
	public static void main(String[] args) {
		
		TreeSet<Product> set = new TreeSet<Product>();
		
		// add products
		set.add(new Product(101, "Laptop", 50000, "Avaiable"));
		set.add(new Product(102, "OOPO", 12000, "Avaiable"));
		set.add(new Product(103, "HP", 56000, "Avaiable"));
		set.add(new Product(104, "IPhone", 120000, "Avaiable"));
		set.add(new Product(105, "Laptop", 50000, "Avaiable"));
		
		// this is Duplicate product
		set.add(new Product(105, "Laptop", 50000, "Avaiable"));
		
		
		for(Product p : set) {
			System.out.println(p);
		}
	
		
	}

}
