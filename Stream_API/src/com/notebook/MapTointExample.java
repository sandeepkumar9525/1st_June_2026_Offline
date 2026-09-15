package com.notebook;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapTointExample {

	public static void main(String[] args) {
		//List<String> list = Arrays.asList("10","20","30","40","-12","10");
		
		
		List<Integer> list = Arrays.asList(2,3,4,5,6,99,12,34,54,56);
		
		//list.stream().mapToInt(s -> Integer.parseInt(s)).forEach(d-> System.out.println(d));
		
		double x  = list.stream().collect(Collectors.maxBy(Integer :: compareTo)).get();
		System.out.println(x);
		
		
	 	
	 
	}

}
