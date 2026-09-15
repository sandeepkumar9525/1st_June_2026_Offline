package com.function;

import java.util.function.Predicate;

public class Example {

	public static void main(String[] args) {
		
//		Predicate<Integer> pd = n -> n % 2 == 0;
//		System.out.println(pd.test(10));
		
//		Predicate<Integer> pd = n -> n>10;
//		System.out.println(pd.test(12));
//		
//		Predicate<String> st = name -> name.length()>5;
//		System.out.println(st.test("Sandeep"));
//		
//		Predicate<Integer> at = salary -> salary> 20000;
//		System.out.println(at.test(18000));
		
//		Predicate<String> ps= name -> name.startsWith("A");
//		System.out.println(ps.test("Amit"));
//		System.out.println(ps.test("Sandeep"));
		
		Predicate<String> sd= name -> name.contains("java");
		System.out.println(sd.test("I am learing java"));
		System.out.println(sd.test("I am leraning C++"));
		

	}

}
