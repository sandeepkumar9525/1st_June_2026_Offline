package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Student {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		list.remove("B");
		System.out.println(list);
	}

}
