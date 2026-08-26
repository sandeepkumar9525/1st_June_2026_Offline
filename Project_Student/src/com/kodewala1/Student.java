package com.kodewala1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ArrayList
		ArrayList<String> arrayList = new ArrayList<>();

		// LinkedList
		LinkedList<String> linkedList = new LinkedList<>();

		// HashSet
		HashSet<String> hashSet = new HashSet<>();

		// linkedHashSet
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

		// TreeSet
		TreeSet<String> treeSet = new TreeSet<>();

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		while (true) {
			System.out.println(" \n----------------------");
			System.out.println(" 1.Add Student");
			System.out.println("2. view ArrayList");
//			System.out.println("3. LinkedList");
//			System.out.println("4. HashSet ");
//			System.out.println(" 5. LinkedHashSet");
//			System.out.println("6. TreeSet ");
//			System.out.println("7. HashMap");
//			System.out.println("8. Remove Student");
//			System.out.println("9. Exting ");
			System.out.println("Enter choice");

			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Enter Student ID");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Student Name");
				String name= sc.nextLine();
				
				arrayList.add(name);
				linkedList.add(name);
				hashSet.add(name);
				linkedHashSet.add(name);
				treeSet.add(name);
				hashMap.put(id, name);
				
				System.out.println("Student Added Successfull");
				
			}
			else if(choice ==2) {
				System.out.println("ArrayList : " + arrayList);
			}

		}

	}

}
