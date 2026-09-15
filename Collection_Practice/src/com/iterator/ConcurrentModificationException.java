package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("J");
		/*
		 * for(String st: list) { if(st.equals("B")) { list.remove("J");
		 * System.out.println(list); }
		 * 
		 * }
		 */

		// Create the Iterator object for the list 
		Iterator<String> itr = list.iterator();
		
		//Loop through the collection as long as there is a next elements
		while (itr.hasNext()) {
			
		// Fetch the current element and move the cursor forward
			String st = itr.next();

			//safely remove the element if it matches the condition
			if (st.equals("A")) {
			// safely updates both the list and the iterator state
				itr.remove();
				System.out.println(list);
			}
		}

	}

}
