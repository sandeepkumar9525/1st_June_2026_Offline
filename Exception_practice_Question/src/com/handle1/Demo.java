package com.handle1;

public class Demo {

	public static void main(String[] args) {
		try {
			checkEligbility(-1);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}

	}

	private static void checkEligbility(int age) {
		if(age <=0) {
			throw new IllegalArgumentException("Age connot be Negative");
		}
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}
		
	}
 
}
