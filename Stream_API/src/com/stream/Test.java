package com.stream;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("BLR", "PTN", "MUB", "HYD", "ADM", "AJM");
		
		List<String> output = list.stream()
				.filter(w -> w.startsWith("A"))
				.map(word -> word.toLowerCase())
				.toList();
		System.out.println(output);

	}

}
