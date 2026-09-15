package com.fail_fast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Rahul");
		list.add("Sandeep");
		list.add("Hemant");
		list.add("fjyjf");

		try {
			// Getting the iterator
			Iterator<String> itr = list.iterator();
			while (itr.hasNext()) {
				String st = itr.next();
				System.out.println("Student Name : " + st);
				
				// modifying the list structural properties during iteration
				if (st.equals("Hemant")) {
					list.add("Kavya"); // this structural change will trigger the exception
				}
			}
		} catch (Exception e) {
			// creating and printing the throws the exception
			System.out.println("\n Exception Catch : " + e);
			System.out.println("Reason Fail-Fast iterator delected a Concurrent modification");
		}

//		Iterator<String> itr = list.iterator();
//		while (itr.hasNext()) {
//			String st = itr.next();
//
//			if (st.equals("Sandeep")) {
//				list.remove("Sandeep");
//			}
//		}
//		System.out.println(list);
	}

}
