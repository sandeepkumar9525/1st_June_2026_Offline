package com.handle.exception;

public class Demo {

	public static void main(String[] args) {
	
		try {
			int number=Integer.parseInt("ABC");
			
			System.out.println(number);
		}
		catch(Exception e) {
			System.out.println("Invalide number Format");
		}
		
		try {
			String name = "Java";
			System.out.println(name.charAt(5));
			
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String index is invalide");
		}
		
		try {
			Object obj = "Hello";
			Integer num = (Integer) obj;
		}
		catch(ClassCastException e) {
			System.out.println("Invalid type casting");
		}
		System.out.println("Program Completed");
	}

}
