package com.mixquestion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("---ArrayList---");
		// ArrayList: Elements maintain insertion order
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Gava");
		list.add("C");
		list.add("D"); // duplicate Allowed
		
		System.out.println(list);
		
		//LinkedList : User Pointers, faster for adding /removing item
		List<Integer> link = new LinkedList<Integer>();
		link.add(22);
		link.add(100);
		link.add(25);
		link.add(22);// duplicate Allowed
		System.out.println("LinkedList : " + link);
	}

}
