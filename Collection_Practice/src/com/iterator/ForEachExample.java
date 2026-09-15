package com.iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ForEachExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		// Using Lambda expression
		list.forEach(st -> System.out.println("List : " + list));
		
		// Using methods Reference (even Cleaner)
		list.forEach(System.out::println);
		System.out.println();
		
		Iterator<String> word = list.iterator();
		while(word.hasNext()) {
			String st = word.next();
			System.out.println(st);
			
			if(st.equals("Two")) {
				word.remove(); // throws ConcurrentModificationException 
				
			}
		}
		System.out.println(list);
		
	}

}
