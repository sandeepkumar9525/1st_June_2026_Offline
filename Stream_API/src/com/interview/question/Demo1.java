package com.interview.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Demo1 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		System.out.println(list);
		
		Optional<Integer> out=list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
		
		System.out.println(out);
				
	}

}
