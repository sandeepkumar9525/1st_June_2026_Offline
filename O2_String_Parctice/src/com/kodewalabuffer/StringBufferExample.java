package com.kodewalabuffer;

public class StringBufferExample {

	public static void main(String[] args) {
		// create a StringBuffer with initial content
		StringBuffer sb = new StringBuffer("Hello ");
		
		
		// user append() method to add more text to the existing String 
		sb.append(" World ");
		sb.append(" from Kodewala Academy");
		System.out.println(sb);
		
		
		System.out.println("----Question 2.-----");
		
		StringBuffer sb2 = new StringBuffer("WelCome to ");
		//user insert() method to insert text at specific position
		sb2.insert (10," Kodewala Academy");
		sb2.append(" Banglore ");
		System.out.println(sb2);
	}

}
