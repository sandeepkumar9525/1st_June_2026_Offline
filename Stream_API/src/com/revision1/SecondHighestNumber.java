package com.revision1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(30000,50000,40000,70000,60000,60000,70000);
		System.out.println(list);
		
		Optional<Integer> output = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	
		System.out.println(output);
		
	}

}
