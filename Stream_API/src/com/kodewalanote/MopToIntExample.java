package com.kodewalanote;

import java.util.Arrays;
import java.util.List;

public class MopToIntExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		
		int totalSum = list.stream().mapToInt(Integer :: intValue).sum();
		
		System.out.println("Total Sum : " + totalSum);
		

	}

}
