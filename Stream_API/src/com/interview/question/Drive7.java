package com.interview.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Drive7 {

	public static void main(String[] args) {
		System.err.println("Merge two lists and remive duplicate");
		
		List<Integer> list = Arrays.asList(1,2,3);
		List<Integer> list1 = Arrays.asList(3,4,5);
		
		List<Integer> out = Stream.concat(list.stream(), list1.stream()).distinct().collect(Collectors.toList());
		
		System.out.println(out);
		
	}

}
