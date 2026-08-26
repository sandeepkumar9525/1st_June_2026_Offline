package com.map;

import java.util.HashMap;
import java.util.Map;

public class Student {
	// instance variables
	int studentId;
	String studentName;
	
	// parametrizeds constructor
	public Student(int studentId, String studentName) {
		this.studentId= studentId;
		this.studentName= studentName;
		
	}
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Student && studentId !=((Student)obj).studentId;
		
	}
	@Override
	public int hashCode() {
		return this.studentName.hashCode() + studentId;
	}
	@Override
	public String toString() {
		return "Name : " + studentName + " , Id: "+studentId;
	}
	
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
	//	Student s= new Student(studentId, studentName);
		Student s1= new Student(102, "Mohan Kumar");
		Student s2= new Student(103, "Rahul Kumar");
		Student s3= new Student(104, "Rohit Kumar");
		Student s4= new Student(101, "Sandeep Kumar");
		
		map.put(101, "Sandeep Kumar");
		map.put(102, "Mohan Kumar");
		map.put(103, "Rahul Kumar");
		
		System.out.println(map.get(102));
		map.get(s2);
		map.remove(s1);
		map.containsKey(s3);
		
		System.out.println(s3); 
	}

}
