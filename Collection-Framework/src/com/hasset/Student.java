package com.hasset;

import java.util.HashSet;

public class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;

	}
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return this.id == s.id;

	}
	@Override
    public int hashCode() {
        return id;
    }


	static class Main {

		public static void main(String[] args) {
			
			HashSet<Student> students = new HashSet<>();
			students.add(new Student(101,"Rahul"));
			
			students.add(new Student(101, "Amit"));
			
			System.out.println(students.hashCode());
			
			System.out.println(students.size());
		}
	}
}
