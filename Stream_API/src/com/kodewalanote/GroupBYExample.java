package com.kodewalanote;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBYExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Cat","Dog","Banana", "Ant","Dite");
		
		
	 Map<Integer, List<String>> st = list.stream().collect(Collectors.groupingBy(String :: length));
	 System.err.println(st);
	
	

	}

}
 