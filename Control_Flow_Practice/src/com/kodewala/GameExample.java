package com.kodewala;

import java.util.Scanner;

public class GameExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int useGuess =0;
		
		int expectedNumber = 5;
		
		while (useGuess != expectedNumber) {
			
			useGuess = sc.nextInt();
			if(useGuess == expectedNumber) {
				System.out.println("Congratulations ! you guessed the correct Number");
				
			}else {
				System.out.println("bad Luck Try Again.");
			}
			
		}

	}

}
