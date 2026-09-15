package com.notebook;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Kodewala","Academy","Java","Spring","Stream");
		
		List<String> print=	list.stream()
				.filter(m-> m.length() >5)  // Select element based on the conditions
				.map(m-> m.toUpperCase()) // transform each elements
				.sorted()            // Another chained operations
				.collect(Collectors.toList()); // Terminal operations
		
		
		System.out.println(print);
		
		
		
		System.out.println("Parallel Stream OutPut");
		
list.parallelStream().forEach(items -> System.out.println(Thread.currentThread().getName() +" - " + items));

	}

}
