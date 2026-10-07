package com.revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionsExample {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(3);
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(5);
		
		Collections.sort(list);
		System.out.println("Sort Number"+list);
		
		Collections.reverse(list);
		System.out.println("reverse Number : " + list.getLast());

	}

}
