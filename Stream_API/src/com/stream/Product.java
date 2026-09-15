package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
	String name;
	double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return name + " " + price;
	}

	public static void main(String[] args) {
		List<Product> list = Arrays.asList(new Product("Book", 1000),
												new Product("Fan", 1600),
												new Product ("Laptop",500000),
												new Product("Mobile", 13000));
		
//		list.stream().map(p -> {p.price = p.price-(p.price * 10/100);
//											return p;}).forEach(System.out :: println);
		
		// forEach
//			list.stream().forEach(p -> {p.price = p.price*0.90; System.out.println(p);});
			
			
		
		// immutability
		list.stream().map(p-> new Product(p.name,p.price*0.90)).forEach(System.out:: println);
	}

}
