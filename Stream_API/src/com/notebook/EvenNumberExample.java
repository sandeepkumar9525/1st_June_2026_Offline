package com.notebook;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberExample {

	public static void main(String[] args) {
	List<Integer> number = Arrays.asList(2,1,2,4,6,8,9);
	
	List<Integer> sum =number.stream()
			.filter(n-> n%2==0) //Select elements based on a conditions
			.map(s -> s*10) // Transform each element
			.collect(Collectors.toList()); //Terminal operations
	
	System.out.println("Even Number : " + sum);
	
	
	System.err.println("Parallel");
	
	number.parallelStream().forEach(items -> System.out.println(Thread.currentThread()+ " - " + items));

	}

}
