package com.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class JavaTest {

	public static void main(String[] args) {

		List<String> list = new CopyOnWriteArrayList<String>();

		list.add("Iphone17");
		list.add("OPPO");
		list.add("Motorola");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			String st = itr.next();
			System.out.println(st);

			if (st.equals("OPPO")) {
				list.add("NEW");
		  }
		}
		System.out.println("New Elements : " + list);
	}

}
