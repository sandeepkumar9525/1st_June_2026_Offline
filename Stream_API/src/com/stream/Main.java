package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> first = Arrays.asList(1,2,3,4,5);  // oneD
		System.out.println(first);
		List<Integer> second = Arrays.asList(6,7,8,9);  //oneD
		System.out.println(second);
		
		List<List<Integer>> twoD = Arrays.asList(first,second);  // TwoD
		System.err.println("TwoD :"+twoD);
	}

}
