package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("HYD","PTN","BLR","DL","MUB","PTN","BLR","DL","MUB");
		
		// Task : fine the Unique city
		
		List<String> out = list.stream().distinct().collect(Collectors.toList()); // remove the duplicate elements
		
		System.out.println(out);
		
		System.out.println();
		
		list.stream().distinct().forEach(e-> System.out.println(e));
		
		
		// filter the city starting with P and give me fist city
		
		System.out.println();
		list.stream().filter(c-> c.startsWith("P")).limit(2).forEach(e -> System.out.println("limit :"+e));
		System.out.println();

		
		list.stream().sorted().forEach(s -> System.out.println("Sorted :"+s));
		System.out.println();
		
		List<String> list1 = Arrays.asList("SK","PTN","BLR","DL","MUB");
		
		list1.stream().skip(2).forEach(w -> System.out.println("Skip : " + w));
	}

}
