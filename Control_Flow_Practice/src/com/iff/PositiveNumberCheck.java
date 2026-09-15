package com.iff;

public class PositiveNumberCheck {

	public static void main(String[] args) {
		int number= -10;
		checkIfPositive( number);

	}
	
	private static void checkIfPositive(int number) {
		if(number>0) {
			System.out.println("The number is positive");
		}else {
			System.out.println("The Number is Nagetive ");
		}
	}

}
