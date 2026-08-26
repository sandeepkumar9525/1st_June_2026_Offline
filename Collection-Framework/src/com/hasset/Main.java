package com.hasset;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
	HashSet<String> set = new HashSet<>();
	// add elements
	set.add("Apple");
	set.add("Banana");
	set.add("Apple");
	
	// print it
	System.out.println(set); // Duplicate  not allowed 
	
	}

}
