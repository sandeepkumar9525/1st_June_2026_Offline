package com.handle;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Stape 1");

		int a = 5;
		int b = 0;
		methodA(a, b);
		
	}

	private static void methodA(int a, int b) {
		methodB(a, b);
	}

	private static void methodB(int a, int b) {

		try {

			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("Divesion by zero is not allowed");
			
		//	System.out.println(e.getMessage()); OutPut / by zero
			
		//	System.out.println(e.hashCode());// OutPut 1706234378
			
		}
		System.out.println("Steop 2");
	}

}
