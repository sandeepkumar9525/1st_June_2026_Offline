package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product> {
	int id;
	String name;

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Product p) {

		return Integer.compare(this.id, p.id);

	}

}

public class Demo {

	public static void main(String[] args) {

		Product p1 = new Product(101, "5G");
		Product p2 = new Product(99, "Realme5G");
		Product p3 = new Product(1001, "Motrala");
		Product p4 = new Product(142, "OPPO");
		Product p5 = new Product(998, "Nokiya");
		List<Product> list = new ArrayList<>();

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			Product p = list.get(i);
			System.out.println(p.id + " " + p.name);

		}

	}

}
