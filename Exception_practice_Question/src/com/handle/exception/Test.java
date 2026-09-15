package com.handle.exception;

public class Test {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Connot divide  by zero");
		}
				

	}

}
