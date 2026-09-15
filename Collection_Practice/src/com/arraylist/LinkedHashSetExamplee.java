package com.arraylist;

import java.util.LinkedHashSet;

public class LinkedHashSetExamplee {

	public static void main(String[] args) {

		LinkedHashSet<String> electronicItems = new LinkedHashSet<String>();
		electronicItems.add("SmartWatch");
		electronicItems.add("SmartPhone");
		electronicItems.add("Laptop");
		electronicItems.add("SmartWatch");

		System.out.println(electronicItems);
		System.out.println();

		for (String item : electronicItems) {
			System.out.println(item);
		}
		System.out.println();

		System.out.println(electronicItems.contains("Laptop"));

		System.out.println(electronicItems.remove("SmartWatch"));
		System.out.println(electronicItems);

	}

}
