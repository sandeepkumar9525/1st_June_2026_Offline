package com.iterator;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		ListIterator<String> listitr = list.listIterator();
		// move forward to the end
		while (listitr.hasNext()) {
		String st =	listitr.next();
			 System.out.println("Forward :"+ st);
			 
			 //Add "Z" right after "B"
			 if(st.equals("B")){
				 listitr.add("Z"); // Safely adds the list inside the loop
			 }
		}
		System.out.println(list);
		
		
		System.err.println();
		// move backward
		while (listitr.hasPrevious()) {
			System.out.println("Backward :"+listitr.previous());
			
			
			
		}

	}

}
