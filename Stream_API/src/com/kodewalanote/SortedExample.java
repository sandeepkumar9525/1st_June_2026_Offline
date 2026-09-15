package com.kodewalanote;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,1,9,3,7);
		
		List<Integer> out =	list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(out);
	}

}
