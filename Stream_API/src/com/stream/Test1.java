package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(Arrays.asList(3, 5), Arrays.asList(7, 8), Arrays.asList(9, 10),
				Arrays.asList(14, 15));

		System.out.println(list);

		List<Integer> output = list.stream().flatMap(map -> map.stream()).filter(w -> w > 6)
				.collect(Collectors.toList());
		System.out.println(output);
		
		List<Integer> output1 = list.stream().flatMap(map -> map.stream()).map(w -> w + 6)  
				.collect(Collectors.toList());                   // map is used to transform data  

		System.out.println(output1);
	}
}
