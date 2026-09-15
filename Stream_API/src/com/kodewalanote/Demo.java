package com.kodewalanote;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
//		List<String> items = Arrays.asList("Kodewala","Academy","Banglore");
//		
//		System.out.println(items);
//		
//	items.stream().forEach(item -> System.out.println(item));
		
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

		long result = nums.stream()
		                  .filter(n -> n % 2 != 0)
		                  .map(n -> n * 2)
		                  .count();
		System.out.println(result);
//	

	}

}
