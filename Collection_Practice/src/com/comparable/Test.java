package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentDetalis implements Comparable<StudentDetalis> {
	int rollNo;
	String name;

	public StudentDetalis(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public int compareTo(StudentDetalis obj) {

//		return this.rollNo - obj.rollNo;// compareTo to RollNo  concept

		return this.name.compareTo(obj.name); // compare to name concept
	}

	@Override
	public String toString() {
		return this.rollNo + " " + this.name;

	}

}

public class Test {

	public static void main(String[] args) {

		List<StudentDetalis> list = new ArrayList<>();
		list.add(new StudentDetalis(12, " Sandeep"));
		list.add(new StudentDetalis(13, " Rahul"));
		list.add(new StudentDetalis(33, " Mohit"));
		list.add(new StudentDetalis(24, " Reeta"));
		list.add(new StudentDetalis(16, " Geeta"));

		Collections.sort(list);

		for (StudentDetalis nam : list) {

			System.out.println("Comparable (By RollNo) : " + nam);
		}

	}

}
