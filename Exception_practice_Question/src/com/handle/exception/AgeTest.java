package com.handle.exception;

public class AgeTest {
	static void checkAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Age must be 18 or above");
		}
		System.out.println(" you are Eligible for vote ");
	}

	public static void main(String[] args) {
		 try {
			 checkAge(56);
		 }
		 catch(Exception e ) {
			 System.out.println(e.getMessage());
		 }
	}

}
