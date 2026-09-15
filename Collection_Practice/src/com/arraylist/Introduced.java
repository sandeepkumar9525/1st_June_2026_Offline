package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Introduced {

	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<String>();
		items.add("Apple");
		items.add("LG");
		items.add("Moto");
		for(String mt : items) {
			System.out.println(mt);
		}
		System.out.println();
		Iterator<String> itr = items.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Reversed :" + items.reversed());
	}

}
