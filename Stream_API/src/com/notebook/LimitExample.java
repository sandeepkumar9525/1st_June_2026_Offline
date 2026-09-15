package com.notebook;

import java.util.Arrays;
import java.util.List;

public class LimitExample {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		
		// complier time error. or output IllegalArgumentException
	//	list.stream().limit(-5).forEach(m-> System.out.println(m));
		
		list.stream()
		.limit(5)  //  keep first n elements
		.forEach(m-> System.out.println(m));
		
	}

}
