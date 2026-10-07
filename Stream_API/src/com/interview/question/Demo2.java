package com.interview.question;

import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		String input= "Banana";
		
		Map<Character, Long> out= input.chars().mapToObj(c-> (char) c)
				.collect(Collectors.groupingBy(c-> c, Collectors.counting()));
		
		System.out.println(out);
		
		
		
		
		
	}

}
