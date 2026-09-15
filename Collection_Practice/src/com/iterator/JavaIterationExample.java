package com.iterator;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
public class JavaIterationExample {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>(); 
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		
		System.out.println(fruits);
		
		System.out.println("---Iterator----");
		
		Iterator<String> itr= fruits.iterator();
		while(itr.hasNext()) {
			String fruit =itr.next();
			System.out.println(fruit);
			
			//System.out.println();
			
//			if(fruit.equals("Banana")) {
//				itr.remove();
//				System.out.println(fruits);
//			}
		}
		
		
		System.out.println("---listIterator---");
		
		ListIterator<String> listitr = fruits.listIterator();
		while(listitr.hasNext()) {
			listitr.next();
			
		}
		while(listitr.hasPrevious()) {
			System.out.println(listitr.previous());
		}
		
		System.out.println("----For Each-----");
		
		// java 8 Lambda 
		fruits.forEach(fruit -> System.out.println("Fruit : " + fruit));

		
		System.out.println("----ConcurrentModificationException------");
		
		try {
			
			for(String fruit: fruits) {
				if(fruit.equals("Apple")) {
					fruits.remove(fruit);
					
				}
			}
		}catch(ConcurrentModificationException e) {
			System.out.println(e.getMessage());
			//System.out.println();
		}
	}

}
