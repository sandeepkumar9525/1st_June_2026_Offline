package com.revision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExemple {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Amit","Rahul","Anand","Suresh","Alok");
		
		List<String> out= list.stream()
		.filter(f-> f.startsWith("A"))
		.map(m-> m.toUpperCase())
		.collect(Collectors.toList());
		 
		 System.err.println(out);
		 
		 for(String st : out) {
			 System.out.println(st);
			 
			 
		 }
		
		

	}

}
