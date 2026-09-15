package com.notebook;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("This is from kodewala","We are in Banglore","Gone with the  wind");
		
		List<String>  out =	list.stream()
				.flatMap(m -> Arrays.stream(m.split(" ")))  //Flatten nested Structures
				.collect(Collectors.toList());
		
		
		System.out.println(out);
	}

}
