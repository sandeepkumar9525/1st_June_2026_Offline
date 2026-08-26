package com.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// Create a TreeSet that safely place null values at the very beginning
		TreeSet<String> set = new TreeSet<String>(Comparator.nullsFirst(Comparator.naturalOrder()));
		
		set.add("Apple");
		
		set.add(null); // this works successful now!
		
		set.add("Mango");
		System.out.println(set); 
	}

}
