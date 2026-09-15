package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
	int id;
	String name;

	public Demo(int id, String name) {
		this.id = id;
		this.name = name;

	}

}

class Employee implements Comparator<Demo> {

	@Override
	public int compare(Demo c1, Demo c2) {
		
		int result = c1.name.compareTo(c2.name); 

		return result;
	}

	public static void main(String[] args) {
		Demo s1 = new Demo(101, "Sandeep");
		Demo s2 = new Demo(103, "Rahul");
		Demo s3 = new Demo(99, "Arun"); 
		Demo s4 = new Demo(77, "Golu");
		Demo s5 = new Demo(66, "Mukesh");
		Demo s6 = new Demo(2, "Rohan");

		List<Demo> list = new ArrayList<Demo>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);

		Collections.sort(list, new Employee());
		for (int i = 0; i < list.size(); i++) {
			Demo st = list.get(i);
//		System.out.println(st.name + " , " + st.id);
//		System.out.println();
			System.out.println(st.id + " , " + st.name);

		}

	}
}
