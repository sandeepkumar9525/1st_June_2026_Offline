package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Class implements Comparable to define default sorting

public class Student implements Comparable<Student> {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public int compareTo(Student obj) {
		// sort by id ascending onj
		return Integer.compare(this.id, obj.id);
		
	}

	public static void main(String[] args) {

		Student st1 = new Student(101, "Sandeep");
		Student st2 = new Student(12, "Rahul");
		Student st3 = new Student(77, "Golu");
		Student st4 = new Student(99, "Monu");
		Student st5 = new Student(112, "Sonu");
		List<Student> list = new ArrayList<Student>();

		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		
		// collections .sort() automatically calls the compareTo methods
		Collections.sort(list);
		
		for(int i =0; i<list.size(); i++) {
			Student st = list.get(i);
			System.out.println(st.id + " , " + st.name);
		}

	}

}
