package com.hasset;

import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		
		HashSet<String> st = new HashSet<String>();
		
		st.add("BLR"); // add elements
		st.add("DL");
		st.add("HYD");
		st.add("BHR");
		st.add("JHR");
		st.add("PN");
		st.add("JM");
		st.add("BLR");
		
	System.out.println(	st.remove("JM"));// Remove elements
	
		System.out.println(st.size());// Number Of elements
		
		System.out.println(st.isEmpty());// Check if empty
		
		
		System.out.println(st.contains("DL"));// Check if elements exists ->true/false
		
		System.out.println(st.clone()); // Remove all elements
		
		

	}

}
