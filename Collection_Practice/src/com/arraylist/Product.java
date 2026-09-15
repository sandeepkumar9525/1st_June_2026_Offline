package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product {

	public static void main(String[] args) {
		List<String> st = new ArrayList<String>();
		List<String> list = Collections.synchronizedList(st);

		list.add("Bag");
		list.add("cloth");
		list.add("Fan");

		System.out.println(list);

		synchronized (list) {
			for (String item : list) {
				System.out.println("List items : " + item);
			}
		}

	}

}
