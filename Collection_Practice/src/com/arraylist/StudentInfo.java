package com.arraylist;

import java.util.Objects;

public class StudentInfo {

	int id;
	String name;

	StudentInfo(int id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof StudentInfo))
			return false;

		StudentInfo s = (StudentInfo) obj;
		return id == s.id && name.equals(s.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);

	}

	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo(123, "Sandeep");
		StudentInfo s2 = new StudentInfo(123, "Sandeep");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println("S1 : " + s1.hashCode() + ", S2 : " + s2.hashCode());

	}

}
