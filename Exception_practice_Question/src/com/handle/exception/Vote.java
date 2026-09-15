package com.handle.exception;

public class Vote {

	public static void main(String[] args) {
		int age = 11;
		try {
			if (age < 18) {
				throw new Exception("Age must be 18 or above");
			}
			System.out.println("You are eligible");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
