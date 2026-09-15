package com.unmodifiable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;


public class UnmodifiableExample {

	public static void main(String[] args) {
		
		//Create a regular mutable list
		List<String> list= new ArrayList<String>();
		
		list.add("Java");
		list.add("C++");
		list.add("Python");
		
		// Create an unmodifiable view wrapper
		List<String> unmodifiable = Collections.unmodifiableList(list);
//		unmodifiable.add("Rohit");
//		System.out.println(unmodifiable);
		
		
		// this will throw java .long UnsupportedOperationException
		try {
			
			unmodifiable.add("Rohit");
			
			
		}catch(UnsupportedOperationException e) {
			
			System.out.println("Connot modify the unmodifiable view directly ");
		}
		
		// change to the original list STILL reflect in the view
		list.add("JavaScript");
		System.err.println("View after altering the original backing list : " + unmodifiable);
	}
	

}
