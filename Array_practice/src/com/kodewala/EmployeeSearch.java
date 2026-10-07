package com.kodewala;

import java.util.Scanner;

public class EmployeeSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String employee[] = new String[5];

		employee[0] = "Radha";
		employee[1] = "Sandeep";
		employee[2] = "Neeta";
		employee[3] = "Geeta";
		employee[4] = "Neha";

		System.out.println("Enter Employee Name to Search");

		String searchName = sc.next();
		boolean found = false;

		for (int i = 0; i < employee.length; i++) {
			if (employee[i].equalsIgnoreCase(searchName)) {

				System.out.println("Employee Found : " + employee[i]);
				found = true;
				break;
			}

		}
		if (!found) {
			System.out.println("Employee with name " + " Not Found ");
		}
		sc.close();

	}

}
