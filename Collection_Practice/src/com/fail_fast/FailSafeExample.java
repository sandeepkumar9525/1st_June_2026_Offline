package com.fail_fast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
//		List<String> list = new CopyOnWriteArrayList<String>();
		
		list.add("A");
		list.add("D");
		list.add("S");
		list.add("K");
		
		Iterator<String> itr= list.iterator();
		while(itr.hasNext()) {
			String st = itr.next();
			System.out.println(st);
			
			
			if(st.equals("K")) {
				list.add("G");
			}
		}
		System.out.println(list);

	}

}
