package com.list;

import java.util.ArrayList;

public class Student {
	private String schoolName;
	private int id;
	private String name;
	private String villageName;
	private int rollNumber;

	public Student(String schoolName, int id, String name, String villageName, int rollNumber) {
		super();
		this.schoolName = schoolName;
		this.id = id;
		this.name = name;
		this.villageName = villageName;
		this.rollNumber = rollNumber;

	}

	public void doSomething() {
		System.out.println("School Name : " + schoolName);
		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Student Village Name : " + villageName);
		System.out.println("Student Roll Number : " + rollNumber);
	}

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();

		Student st = new Student("ABC", 101, "Sandeep Kumar", "Kothua SarangPur", 35);
		Student st2 = new Student("ABC", 102, "Rohul Kumar", "Unjay", 20);
		Student st3 = new Student("ABC", 103, "Sarika kumari", "Maharajgang", 10);
		Student st4 = new Student("ABC", 104, "Mohan Kumar", "Loper", 33);
		Student st5 = new Student("ABC", 105, "Rohit Kumar", "Korari", 12);
		
		students.add(st);
		
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		

		for (Student s : students) {
			System.out.println("====================");
			s.doSomething();
		}

	}

}
