package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(10);
		System.out.println(list);

		List<Integer> st = Collections.unmodifiableList(list);
		 st.add(5);
		 System.out.println(st);

	}

}
