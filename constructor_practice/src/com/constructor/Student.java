package com.constructor;

public class Student {
	String name;
	int age;
	
	
	// Parameterized constructor
	public Student(String name, int age) {
		this.name= name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("Student Name :" + name);
		System.out.println("Studnet Age : "+ age);
	}
	public static void main(String[] args) {
		Student st = new Student("Sarika", 22);
		st.print();
		
	}

}
