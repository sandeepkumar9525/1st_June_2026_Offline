package com.utllity;

import java.util.Iterator;

import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {
		
		// Fail safe
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		
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
			 
			 if(element.equalsIgnoreCase("HYD")) {
			 System.out.println("Test.main() ...Remving");
			 }
			 
			 list.remove(3); //ConcurrentModificationException
		 }

	}

}
