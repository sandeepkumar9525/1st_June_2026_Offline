package com.utllity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drive {

	public static void main(String[] args) {
		
		List<String> set= new ArrayList<String>();
		set.add("BLR");
		set.add("SIN");
		set.add("CPR");
		set.add("PTN");
		set.add("GPL");
		
		System.out.println(set);
		
		Collections.sort(set);
		
		System.out.println(set);
		
		List<String> unList = Collections.unmodifiableList(set);
		//trying to modify it
//		unList.add("KoL");
		
		System.out.println(unList);
		
		List<String> syncList = Collections.synchronizedList(set);
		
		Collections.reverse(set);
		
		System.out.println(set);
		
		
		
		

	}

}
