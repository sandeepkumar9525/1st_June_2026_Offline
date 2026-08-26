package com.kodewala;

public class Student {
	private int id;
	private String name;
	private int age;
	
	public Student(int id, String name, int age ) {
		this.setId(id);
		this.name= name;
		this.age= age;
		
	}
	
	public void doSomething() {
		
		System.out.println("Student Id : " + getId());
		System.out.println("Student Name : " + name);
		System.out.println("Student Age : " + age);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
