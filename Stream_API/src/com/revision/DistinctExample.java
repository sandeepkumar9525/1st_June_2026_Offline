package com.revision;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctExample {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,2,4,3,5);
		
		List<Integer> out=	number.stream()
				.distinct() // remove duplicate elements 
				.collect(Collectors.toList()); // terminal operations
		System.out.println(out);
		
		
		

	}

}
