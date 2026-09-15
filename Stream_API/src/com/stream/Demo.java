package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		// Storing the data ...1m
		List<String> list = Arrays.asList("BLR", "PTN", "MUB", "HYD", "ADM", "AJM");
		
		// processing ---> Task (find the name starting with "A");
		
		Stream<String> inputStream = list.stream();
		
		// 1.convert the collection to stream object
		
		
		Stream<String> filteredStream = inputStream.filter(city -> city.startsWith("A"));
		
		// 2. find the name collection with 'A' --> use filter 
		List<String> citysatrtsWithA= filteredStream.collect(Collectors.toList());
		
		// 3. collect or print the city name 
		System.out.println(citysatrtsWithA);
		
		
		List<String> start = list.stream().filter(w -> w.startsWith("A")).collect(Collectors.toList());
		System.out.println(start);

	}

}
