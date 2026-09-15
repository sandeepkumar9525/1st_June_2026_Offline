package com.synchronizedd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product {

	public static void main(String[] args) {
	
		List<String> product = new ArrayList<>(); // create a normal list of product item
		
		List<String>list = Collections.synchronizedList(product); // warp it with a synchronized list
		
		
		// adding items to the synchronized 
		list.add("Laptop");
		list.add("Moblie");
		list.add("BOOks");
		
		System.out.println(" synchronized List : " + list); // display the synchronized list
		
		synchronized(list) { // Iterating over the synchronized list (must use synchronized block)
			
			for(String item : list) {
				System.out.println("List item : " + item);
			}
		}
		
		

	}

}
