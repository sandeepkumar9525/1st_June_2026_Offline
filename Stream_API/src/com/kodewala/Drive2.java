package com.kodewala;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Drive2 {

	public static void main(String[] args) {
		String input = "Hello";

		List<Character> output = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		
		System.out.println(output);
		
		String input1 = "swiss";
		
		Map<Character, Long> output2 = input1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c-> c, Collectors.counting()));

		System.out.println(output2);
	}

}
