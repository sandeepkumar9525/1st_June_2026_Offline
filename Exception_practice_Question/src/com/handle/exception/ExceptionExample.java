package com.handle.exception;

public class ExceptionExample {

	public static void main(String[] args) {

		try {
			// this line will throw an ArithmeticException
			int a = 10 / 0;
			System.out.println("Result ");
		}
		// Handling the exception gracefully
		catch (ArithmeticException e) {
			System.out.println("Error : you cannot divide a number of zero");
		}

		// this code is always executes
		finally {
			System.out.println("Exception of try-catch block completed ");
		}
		System.out.println("The rest of the application is still running perfectly!");
	}

}
