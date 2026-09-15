package com.notebook;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumberExample {

	public static void main(String[] args) {
		
		List<Integer> odd = Arrays.asList(3,4,5,7,9,10,12);
		
		List<Integer> num =	odd.stream()
		.filter(n-> n % 2 == 1) // Select elements based on a conditions
		.map(m -> m *3) // transform each elements 
		.collect(Collectors.toList()); // terminal operations
		
		System.out.println("Odd Number : " + num);
		
	}

}
