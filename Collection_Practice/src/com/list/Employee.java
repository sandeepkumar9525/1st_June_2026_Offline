package com.list;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// add element
		list.add("Sandeep");
		list.add("Mohan");
		list.add("Sandeep");
		list.add("Ravi");
		list.add("Golu");
		list.add("Rohan");
		list.add("Shohan");
		
		// print it
		//System.out.println(list);
		
		
		for(int index =0; index < list.size(); index++ ) {
			String name = list.get(index);
			
			if(name.startsWith("S")) {
				System.out.println(name);
			}
			
		}
//		 for each
//		for(String name : list ){System.out.println(name);}
//			
//		}
	}

}
