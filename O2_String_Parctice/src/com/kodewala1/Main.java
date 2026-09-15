package com.kodewala1;

public class Main {

	public static void main(String[] args) {
		
		String s1 = "kodewala";
		String s2 = "kodewala";
		String s3 = "kodewala";
		
		
		String s4 = new String("kodewala");
		
		String s6 = s4.intern();
		System.out.println(s3==s6); // true
		
		String s5 = new String("kode");
		String s7 = new String("kode");
		
		
		System.out.println(s5==s7);
		System.out.println(s5.equals(s7));
		

	}

}
