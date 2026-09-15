package com.collections.hasmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(101, "Rahul");
		map.put(102, "Sandeep");
		map.put(103,"Rohit");
		
		System.out.println(map);
		map.put(102, "Jiya");
		
		System.out.println("HasMap :" + map);
		String name= map.get(101);
		System.out.println(name);
		
//		map.remove(101);
//		System.out.println(map);
		
		
		
		
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("ID : " + entry.getKey() + " Name : " + entry.getValue() );
			
		}
	}

}
