package com.handle;

public class Demo2 {

	public static void main(String[] args) {
		try {
			System.out.println("Outer try Strats");
			try {
				System.out.println("inner try start");
				System.out.println(5/0); // new ArithmeticException("/ by zero")
				
			}
			catch(NullPointerException e) {
				System.out.println("null are not allowed");
			}
			
			System.out.println("Outer try End");
		}
		catch(ArithmeticException e) {
			System.out.println("\"Division by zero is not allowed : Outer");
		}
	}

}
