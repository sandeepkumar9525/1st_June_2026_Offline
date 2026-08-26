package com.hashcode.set;

import java.util.Collections;
import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		
		HashSet<String> st =new HashSet<>(); // Capacity : 16
		
		
		
	//	st.add("DL");
		st.add("DL");//return
		
		//calculate the hash for the elements
		int hash = "DL".hashCode();
		
		int spreadHash = hash^(hash>>> 16);
		
		int bucket = hash & (16-1);
		
		System.out.println("Bucket is : " + bucket);
		System.out.println(hash);
		
	
		st.add("HYD");
		st.add("BHR"); 
		st.add("UK");
		st.add("SIWAN");
		st.add("UP");
		st.add("BLR");
		System.out.println(st);// Stored only unique element 

		
 		
		

	}

}
