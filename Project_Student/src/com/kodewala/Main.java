package com.kodewala;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Student> students = new ArrayList<>();

		while (true) {
			System.out.println(" 1. Added Student ");
			System.out.println(" 2. View Stduent");
			System.out.println(" 3. Searech Student");
//			System.out.println(" 4. Delete Student");
			System.out.println(" 5.Exting");

			System.out.println(" 6. Enter choice");
			int choice = sc.nextInt();
			if (choice == 1) {

				System.out.println("Enter ID");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Name");
				String name = sc.nextLine();

				System.out.println("Enter Age");
				int age = sc.nextInt();
				sc.nextLine();

				Student s = new Student(id, name, age);
				students.add(s);

				System.out.println("Student  Added Successfull ");

			} else if (choice == 2) {

				if (students.isEmpty()) {
					System.out.println("No Student found");
				}

				else {
					for (Student s : students) {
						s.doSomething();
					}
				}

			} else if (choice == 3) {
				
				System.out.println("Enter Name ID");
				
				int id = sc.nextInt();
				
				boolean found = false;
				
				for (Student s : students) {
					if(s.getId()==id) {
						
						System.out.println(" Student Id Successfull");
						s.doSomething();
						found = true;
					}
				}
				if(!found) {
					System.err.println("Worng Id : Please try Agin");
				}
			}
			else if(choice ==5) {
				System.out.println(" Thank You");
				break;
			}

		}
	}
}