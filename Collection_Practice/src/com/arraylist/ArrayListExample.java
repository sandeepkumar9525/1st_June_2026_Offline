package com.arraylist;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		for(Integer num : list) {
			System.out.println(num);
		}
		System.out.println("Array List : " + list);
		

	}

}
