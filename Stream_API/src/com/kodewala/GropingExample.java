package com.kodewala;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GropingExample {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Hyderbad", "Surat", "Mysore", "Chennai", "Chennai", "Jaipur", "Noida",
				"banglore", "Grurgram", "Delhi", "Mumbai", "Ahmedabad");

		long total = list.stream().collect(Collectors.counting());
		System.out.println(total);
		
		Map<Object, List<String>> output= list.stream().collect(Collectors.groupingBy(c-> c.length()));
		
		System.err.println(output);
	}
}