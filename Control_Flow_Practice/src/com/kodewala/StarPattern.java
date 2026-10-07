package com.kodewala;

public class StarPattern {

	public static void main(String[] args) {

		// for loop
		for (int i = 1; i <= 5; i++) {

			// inner loop
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------Reverse---------");
		for (int i = 5; i >= 1; i--) {

			// inner loop
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

}
