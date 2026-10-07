package com.notebook;

import java.util.Arrays;
import java.util.List;

public class CountExample {

	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("Kodewala","BTM","Banglore","Ba");
		
	long out =	list.stream()
		.filter(name -> name.startsWith("B")) // intermediate operation
		.count();  // Terminal operation
		
		
		System.out.println(out);
	}

}
