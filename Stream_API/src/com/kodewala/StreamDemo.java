package com.kodewala;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 8, 13, 5, 7, 11, 6, 16);

		// Stream API
		List<Integer> number = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		List<Integer> numbers = list.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());

		System.out.println("Even Number : " + number);

		System.out.println("Odd Number :" + numbers);

	}

}
  