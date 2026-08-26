package com.handle1;

public class Test {

	public static void main(String[] args) {
		try {
			//int a= 6/0;
			String s = null;
			s.length();
		}
		
		catch(ArithmeticException | NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		catch(Exception e) {
			System.out.println("Some generce Exception");
		}
		
	}

}
