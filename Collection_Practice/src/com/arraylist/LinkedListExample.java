package com.arraylist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
	
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		
		list.addFirst(5);
		list.addLast(60);
		System.out.println(list);
		
		

	}

}
