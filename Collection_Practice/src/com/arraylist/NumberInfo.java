package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class NumberInfo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list.contains(40));
		System.out.println();
		
		System.out.println(list.size());
		
		System.out.println();
		// Enhanced for loop (Cleaner , no index tracking needed
		for(Integer num : list) {
			System.out.println(num);
		}
		
		

	}

}
