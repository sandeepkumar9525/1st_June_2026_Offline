package com.kodewala1;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	String name;
	int age;

	transient String password;

	public Student(String name, int age, String password) {
		this.name = name;
		this.age = age;
		this.password = password;

	}

}
