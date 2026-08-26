package com.handle;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println("Outer try Strats");
			try {
				System.out.println(5/0); // new ArithmeticException("/ by zero")
				System.out.println("inner try End");
			}
			catch(ArithmeticException e) {
				System.out.println("Division by zero is not Allow : inner");
			}
			
			System.out.println("Outer try End");
		}
		catch(ArithmeticException e) {
			System.out.println("\"Division by zero is not allow : Outer");
		}
	}

}
