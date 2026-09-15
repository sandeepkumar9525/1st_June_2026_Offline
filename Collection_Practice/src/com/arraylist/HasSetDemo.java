package com.arraylist;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetDemo {

	public static void main(String[] args) {
		HashSet<String> has = new HashSet<String>();
		has.add("Laptop");
		has.add("Mobile");
		has.add("Books");
		has.add("Car");
		has.add("Mobile"); // duplicate not allowed 
		
		has.add(null); // HasSet allowed one null value
		System.out.println("Hash Set : "+has);
		
		Iterator<String> itr = has.iterator();
		while(itr.hasNext()) {
			//String st = itr.next();
			System.out.println(itr.next());
		}
		

	}

}
