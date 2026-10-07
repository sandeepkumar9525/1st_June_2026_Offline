package com.revision;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// create an ArrayList of String
		List<String> list = new ArrayList<String>();

		list.add("Apple");
		list.add("Banana");
		list.add("Apple"); // duplicate are allowed

		// Access an element by index
		System.out.println("First Frutis Item : " + list.get(0));

		// loop through the list
		for (String st : list) {
			System.out.println("Fruits : " + st);
		}
	}

}
