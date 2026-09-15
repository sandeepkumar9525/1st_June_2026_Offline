package com.kodewalanote;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Number {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,5,1,2,4,6,7,8,9);
		
		List<Integer> num = number.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println("Even Number :"+num);
		
		List<Integer> nam = number.stream().filter(d -> d%2==1).collect(Collectors.toList());
		
		System.out.println("Odd Number : " + nam);
		
		List<Integer> nam1 = number.stream().filter(d -> d%2==1).map(n -> n*10).collect(Collectors.toList());
		System.out.println(nam1);
	}

}
