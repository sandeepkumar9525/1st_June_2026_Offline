package com.kodewala;

public class Test {

	public static void main(String[] args) {
		
		int number = 10;
		checkInfo(number);
		

	}
	
	private static void checkInfo(int number) {
		if(number >0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("Number is negative");
		}
		
	}


}
