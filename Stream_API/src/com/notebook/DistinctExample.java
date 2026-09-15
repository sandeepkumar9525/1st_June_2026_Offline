package com.notebook;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {

	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("One","Two","three","One");
		
		list.stream()
		.distinct()  // remove duplicates
		.forEach(m-> System.out.println(m));
	}

}
