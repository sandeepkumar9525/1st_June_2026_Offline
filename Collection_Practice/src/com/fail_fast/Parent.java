package com.fail_fast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Parent {

	public static void main(String[] args) {

		List<String> set = new ArrayList<String>();
		set.add("Rahul");
		set.add("Rohit");
		set.add("Mohan");
		set.add("Golu");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String st = itr.next();
			
			
			set.remove(3);
			System.out.println(st);
		}

	}

}
