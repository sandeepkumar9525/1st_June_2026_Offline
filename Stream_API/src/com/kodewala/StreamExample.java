package com.kodewala;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		System.err.println("---Sequential--Stream--Example");
		
		list.stream().forEach(num -> System.out.println(num + " processed by " + Thread.currentThread().getName()));
		
		System.err.println("---Parallel Stream Example...");
		
		
		list.parallelStream().forEach(nam -> System.out.println(nam + " processed by "+ Thread.currentThread().getName()));
	}

}
