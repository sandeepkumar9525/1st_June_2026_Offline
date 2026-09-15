package com.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//create the list of String
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Gava");
		
		// Access an element by index (0-based)
		String st = fruits.get(0);
		System.out.println(fruits);
		
		// remove an element
		fruits.remove("Banana");
		
		// Iterate through the list
		for(String dv : fruits) {
			System.out.println(dv);  
		}

	}

}
