package com.kodewala;

import java.util.Scanner;

public class SwitchMonthExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");

		String month = sc.next();

		switch (month) {

		case "A":
			System.out.println("January");
			break;
		case "B":
			System.out.println("February");
			break;
		case "C":
			System.out.println("March");
			break;
		case "D":
			System.out.println("April");
			break;
		case "E":
			System.out.println("May");
			break;
		case "F":
			System.out.println("June");
			break;
		case "G":
			System.out.println("July");
			break;
		case "H":
			System.out.println("August");
			break;
		case "I":
			System.out.println("September");
			break;
		case "J":
			System.out.println("October");
			break;
		case "K":
			System.out.println("November");
			break;
		case "L":
			System.out.println("December");
			break;

		}

	}

}
