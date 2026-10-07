package com.interview.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Drive6 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Banana","Apple","Kiwi","grape");
		
		System.err.println("Sort a list string by length");
		list.stream().sorted(Comparator.comparingInt(w-> w.length())).forEach(e-> System.out.println(e));
		
		
		System.err.println("Find the longest String in a list");
	String out=	list.stream().max(Comparator.comparing(String :: length)).orElse(null);
	System.out.println("Largest word :"+out);
	
	
	
	System.err.println("Find the lowest String in a list");
	String output=	list.stream().min(Comparator.comparing(String :: length)).orElse(null);
	System.out.println("Largest word :"+output);
	}

}
