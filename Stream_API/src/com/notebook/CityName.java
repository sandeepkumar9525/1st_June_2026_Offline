package com.notebook;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CityName {

	public static void main(String[] args) {
	List<String> list = Arrays.asList("Banglore", "Chennai","Delhi");
	
	List<String> out= list.stream()
			.filter(m-> m.startsWith("D")) // select elements based of conditions
			.map(s -> s.toUpperCase())  // transform each elements
			.collect(Collectors.toList()); // terminal operation
	
	
		System.out.println(out);
	}

}
