package com.stream.discount;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
	String name;
	double price;
	public Product(String name, double price) {
		this.name= name;
		this.price = price;
	}
	
	public String toString() {
		return name + " " + price;
	}

	public static void main(String[] args) {
		
		List<Product> product = Arrays.asList(new Product("Earphones",1500)
											, new Product("Smartwatch", 4000)
											, new Product ("Gaming Console", 45000)
											,new Product("KeyBoard", 2500)
											, new Product("Television", 65000));
		
		List<Product>out = product.stream().filter(w -> w.price>3000)
				                           .map(p -> {p.price = p.price * 0.85;return p;})
				                           .collect(Collectors.toList());
		 
		System.out.println(out);
		
		
		for(Product itemDiscount :out) {
			System.out.println(itemDiscount);
		}
		
		}
	
}
