package com.interview.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Drive5 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Cat","Elephant","Tiger","Hippopotamus","q");
		
	String  result=	list.stream().max( Comparator.comparing(String::length)).orElse("");
	
	System.out.println("Langest word:" + result);
	
	String  result1=	list.stream().min( Comparator.comparing(String::length)).orElse("");
	
	System.out.println("lowest word:" + result1);
		
		
	}

}
