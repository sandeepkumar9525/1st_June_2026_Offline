package com.handle.exception;

public class Finally {

	public static void main(String[] args) {
		try {
			System.out.println("Try");
		}
		catch(Exception e) {
			System.out.println("Catch");
		}
		finally{
			System.out.println("finally");
		}
	}

}
