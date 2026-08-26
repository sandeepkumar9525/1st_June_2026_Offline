package com.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class Student {
	//instance variable
	int id;
	// Parameterizes constructor
	public Student(int id) {
		this.id= id;
		
	}
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Student  && id == ((Student) obj).id;
	}
	@Override
	public int hashCode() {
		return id;
	}
	

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		Student s= new Student(10);
		Student s2= new Student(12);
		Student s3= new Student(12);
		
		set.add(s);
		set.add(s2);
		set.add(s3);
		System.out.println(set.size());
		
		
	}

}
