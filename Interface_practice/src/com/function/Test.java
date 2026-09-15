package com.function;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
	
		Function<Integer, Integer> st= n -> n*n;
		System.out.println(st.apply(99));
		
		Function<String, Integer> sp = name -> name.length();
		System.out.println(sp.apply("Sarika"));
		System.out.println(sp.apply("Sandeep"));
		
		Function<String,String> ad = name -> name.toUpperCase();
		System.out.println(ad.apply("sarika"));

	}

}