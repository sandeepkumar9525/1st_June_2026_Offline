package com.kodewala;

public class breakExample {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				 continue; // skip the iteration 1 equals 5
//				break; // exit the loop

			}
			System.out.println("I:" + i);
		}
		System.out.println("Loop has Ended ");

	}

}
