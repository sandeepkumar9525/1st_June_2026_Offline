package com.handle.exception;

public class FileExample {

	public static void main(String[] args) {
		try {
			String name = null;
			int arr[] = { 2, 5, 8 };
			System.out.println(arr.length);
			System.out.println(arr[0]);
			System.out.println("index valid");
			System.out.println("Name is null");
		}

		// catch(Exception e) {} not allowed because all ready handing

		catch (NullPointerException e) {
			System.out.println("Null is not allowed");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}

	}

}
