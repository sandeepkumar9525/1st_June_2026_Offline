package com.kodewala1;

public class StringImmutability {

	public static void main(String[] args) {

		String s1 = "Kodewala"; // Stored SCP
		
		String s2 = s1.concat(" Academy"); // Create a new Object in the Heap
		String s3 = s2.concat(" Banglore");
		
		// Original String remains unchanged
		
		System.out.println("S1 :" + s1); 
		
		System.out.println("S2 : " + s2);
		System.out.println("s3 : " + s3);
		
		System.out.println("s1 or s2 are the same : " + s1==s2); //false
		
		System.out.println(" Are s1 or s2  the same : " + s1.equals(s2)); //false

	}

}
   