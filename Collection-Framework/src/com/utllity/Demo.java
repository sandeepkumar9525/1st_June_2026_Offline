package com.utllity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("BLR");
		list.add("PTN");
		list.add("MUB");
		list.add("CHE");
		list.add("HYD");
		
		 Iterator<String> itr=list.iterator();
		 while(itr.hasNext()) {
			 String element= (String) itr.next();
			 System.out.println(element);
			 
			 // removing the element at index 3rd // modify the collection
			 
			// list.remove(3); //ConcurrentModificationException
		 }

	}

}
