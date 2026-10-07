package com.revision;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		// create HashSet to Integer
		Set<Integer> set = new HashSet<Integer>();

		set.add(10);
		set.add(20);
		set.add(10); // duplicate are not allowed
		set.add(30);

		// check if an item exists
		System.out.println("Contain 20: " + set.contains(20));

		// print the size
		System.out.println("total Size : " + set.size());

		// loop through set
		for (Integer it : set) {
			System.out.println("Number of set : " + it);
		}

	}

}
