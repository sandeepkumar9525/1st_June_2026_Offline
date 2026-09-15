package com.kodewala;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

class Product implements Comparable<Product> {
	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Product obj) {

		// return this.id - obj.id;
		// return this.name.compareTo(obj.name);
		return Double.compare(this.price, obj.price);

	}

	@Override
	public String toString() {
		return this.id + " " + this.name;
	}

}

public class Order {
	
	private Map<String, Product> map = new HashMap<String, Product>();

	private Set<String> set = new HashSet<String>();

	private Queue<String> queue = new LinkedList<String>();

	private List<String> list = new ArrayList<String>();

	private Set<Product> tree = new TreeSet<Product>();

	public static void main(String[] args) {
		
		Order system = new Order();
		
//		system.addmap(new Product(101, "Laptop", 45000.90));

	}

}
