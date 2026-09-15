package com.kodewala;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Drive {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9,12,13,14,15,16,17,0,-1,18,19,20,21,22,32);
		
	Map<Boolean, List<Integer>> output=	list.stream().collect(Collectors.partitioningBy(n-> n % 2 == 0));
	
	System.err.println(output);

	}

}
