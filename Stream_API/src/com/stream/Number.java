package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Number {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,44,66,77,90,70,55);
		
		List<Integer> start= list.stream().filter(num -> num >50).collect(Collectors.toList());
		System.out.println(start);

	}

}