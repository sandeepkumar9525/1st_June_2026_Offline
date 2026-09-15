package com.encapsulation1;

public class StudentInfo {

	public static void main(String[] args) {
		Student st = new Student(123, 600);
		
		System.out.println(st.amount);
		
	//	System.out.println(st.balance()); this is not direct  access allowed 
		
		
		System.out.println(st.getBalance());

	}

}
