package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TestNumber {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println(list);

		System.out.println(list.get(2));

		// Traditional for loop se element ko access and modify karna
		for (int i = 0; i < list.size(); i++) {
			int currentNum = list.get(i);
			if (currentNum == 30) {
				list.set(i, 35);
				System.out.println("Index : " + i + " change 30 to 35");
				System.out.println(list);
			}

		}

	}

}
