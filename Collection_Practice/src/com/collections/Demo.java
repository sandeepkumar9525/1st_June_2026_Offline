package com.collections;

import java.util.HashMap;
import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(101, "Rahul");
		map.put(102, "Sandeep");
		map.put(103, "Rohti");
		map.put(101, "Mohan");

		System.out.println(map);

		System.out.println("-------HashsSet-----------");

		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Rahul");
		hashSet.add("Sandeep");
		hashSet.add("Rohit");
		hashSet.add("Rahul"); // duplicate elements
		System.out.println(hashSet);
	}

}
