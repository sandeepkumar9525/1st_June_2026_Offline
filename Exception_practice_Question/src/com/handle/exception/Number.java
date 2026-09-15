package com.handle.exception;

public class Number {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);

		} catch (ArithmeticException e) {
			System.out.println("connot by divide zero");
		}
		try {
			String name = null;
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("Name is not allowed null!.");
		}
		try {
			int arr[] = { 2, 4, 5, 6 };
			System.out.println(arr[5]);
			System.out.println("Successfull index");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid number index");
		}
		System.out.println("Progra  m completed");
	}

}
