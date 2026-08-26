package com.hashcode.set;

import java.util.HashSet;
import java.util.Set;

public class TestInfo {

	public static void main(String[] args) {
	Set<String> st = new HashSet<String>();
	st.add("apple");
	st.add("Banana");
	st.add("Mango");
	st.add("Orange");
	st.add("Grapes");
	st.add("Papaya");
	st.add("Guava");
	st.add("Pineapple");
	st.add("Watermelon");
	st.add("Straberry");
	st.add("Cherry");
	st.add("Pomegranate");
	st.add("Kiwi");
	//st.add("Pear");
	//st.add("Lemon");
	//st.add("Blueberry");
	//st.add("Avocado");
	
	int hash ="Pear".hashCode();
	int spreadHash= hash^(hash >>> 16);
	int bucketNumber = spreadHash & 15;
	
	System.out.println(bucketNumber);
	System.out.println(st.hashCode());
	
	System.out.println(st);

	}

}
