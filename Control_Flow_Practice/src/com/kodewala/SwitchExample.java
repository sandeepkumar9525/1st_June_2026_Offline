package com.kodewala;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");

		int day = sc.nextInt();
		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
		default:
			System.out.println("Not Valide Number");
			break;

		}

	}

}
