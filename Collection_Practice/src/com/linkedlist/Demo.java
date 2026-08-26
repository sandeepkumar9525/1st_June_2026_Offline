package com.linkedlist;

import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();
		// add elements
		name.add("Dog");
		name.add("Cat");
		name.add("Elephant");
		name.add("Horse");
		name.add("Fish");
		name.add("Cow"); 
		name.add(null); // null is allowed
		
		// Print it
		System.out.println(name);
		System.out.println(name.get(3));
		System.out.println(name.getFirst()); // First index (DOG)
		System.out.println(name.getLast()); // Last index (NULL)
	}

}
