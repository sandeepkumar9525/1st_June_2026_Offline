package com.notebook;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {

	public static void main(String[] args) {
		
		System.err.println("Default(natural) Sorting");
	 
		List<String> list = Arrays.asList("Banana","Apple","Cherry");
		
		list.stream().sorted().forEach(a -> System.out.println(a));
		
		List<Integer> number = Arrays.asList(3,5,4,14,32,54,1,23,4,5,6);
		
		List<Integer> out = number.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
		
		System.err.println(out);
	}

}
