package com.set;

import java.util.Set;
import java.util.TreeSet;

public class Number {

	public static void main(String[] args) {
		Set<Integer> num = new TreeSet<Integer>();
		num.add(1);
		num.add(22);
		num.add(0);
		num.add(-2);
		num.add(5);
		num.add(9);
		num.add(null);// dose not allow the element
		
		System.out.println(num.contains(0));// search elements
		
		// Stored  order
		System.out.println(num);

	}

}
