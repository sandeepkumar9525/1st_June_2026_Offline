package com.notebook;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FilterExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hi","Java","Go","Kodewala","AI");
		
		List<String> out = list.stream().filter(m-> m.length() >2).collect(Collectors.toList());
		
		System.out.println(out);

	}

}
