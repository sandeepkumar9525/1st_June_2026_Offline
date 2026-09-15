package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// add elements 
		numbers.add(45);
		numbers.add(12);
		numbers.add(89);
		numbers.add(12);
		numbers.add(23);
		numbers.add(-2);
		//numbers.add(null);
		
		
		System.out.println("Object List : " + numbers);
		
		// sort methods
		Collections.sort(numbers);
		System.out.println("Sort Number : " + numbers);
		
		// reverse methods
		Collections.reverse(numbers);
		System.out.println("Reverse Number : " + numbers);
		
		// max methods
		 int maxlev =Collections.max(numbers);
		
		System.out.println("Maximum Nnmber : " +maxlev );
		
		// min methods
		int minlev =Collections.min(numbers);
		System.out.println("Minmum Number : " + minlev);
		
		int count = Collections.frequency(numbers, 12);
		System.out.println("reputy number : " + count)
		;
//		Collections.synchronizedCollection(numbers);
//		System.out.println(numbers);

	}
}
