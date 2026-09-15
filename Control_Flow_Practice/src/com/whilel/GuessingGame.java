package com.whilel;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		int userGuess = 0;
		int expectedNumber = 5;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Guess Number");

		while (userGuess != expectedNumber) {
			userGuess = sc.nextInt();
			if (userGuess == expectedNumber) {
				System.out.println("Congratulation! You Guessed the Correct Number");
			} else {
				System.out.println("Bad Luck! Try Again");
			}
		}

	}

}
