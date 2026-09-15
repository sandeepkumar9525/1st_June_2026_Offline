package com.collections;

import java.util.Objects;
import java.util.HashSet;

public class Student {
	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Student student = (Student) obj;

		return rollNo == student.rollNo && Objects.equals(name, student.name);

	}

	@Override
	public int hashCode() {

		return Objects.hash(rollNo, name);
	}

	@Override
	public String toString() {
		return rollNo + " = " + name;
	}

	public static void main(String[] args) {
		HashSet<Student> students = new HashSet<>();

		Student s1 = new Student(101, "Rahul");

//it will be considered a duplicate due to equals and hashCode will flag it as a duplicate
		Student s2 = new Student(101, "Rahul");
		
		students.add(s1);
		students.add(s2);
		System.out.println(students);

	}
}