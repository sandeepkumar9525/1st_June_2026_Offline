package com.forr;

public class Welcome {

	public static void main(String[] args) {
		int n = 10;
		// loop to print the message 10 time
		for (int i = 0; i < n; i++) {
			System.out.println("Welcome to Kodewala Academy");
		}

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n; i > 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}