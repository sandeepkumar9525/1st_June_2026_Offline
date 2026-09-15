package com.fail_fast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String name = itr.next();

			list.remove(0);

			// list.add("Mango"); ConcurrentModificationException Because loop this not add here;
		}

		list.add("Mango");
		System.out.println(list);

	}

}
