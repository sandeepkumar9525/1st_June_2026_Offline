package com.kodewala;

public class Test {

	public static void main(String[] args) {
		String s1= "abc";
		String s2= new String("abc");
		String s3= new String("xzy");
		String s4=s2;
		String s5= s1;
		
		System.out.println(s4==s2); // true
		System.out.println(s2.equals(s3)); // false
		System.out.println(s2.equals(s2)); // true

	}

}
