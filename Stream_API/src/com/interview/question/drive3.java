package com.interview.question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class drive3 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,1,2,5);
		
		Set<Integer> output = list.stream().filter(n-> Collections.frequency(list, n) >1).collect(Collectors.toSet());
		System.out.println(output);
	}

}
