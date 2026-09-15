package com.fail_fast;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> items = new CopyOnWriteArrayList<String>();

		items.add("Book");
		items.add("Mobile");
		items.add("Laptop");

		Iterator<String> itr = items.iterator();
		while (itr.hasNext()) {
			String st = itr.next();
			
			System.out.println(st);
			
			items.add("Mango");
//			
//			if(!items .contains("Mango")) {
//				items.add("Mango");
//			}

			
		}

		System.out.println("Final items : " + items);
	}

}
