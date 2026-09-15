package com.notebook;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("KodeWala","Academy","Banglore");
		System.out.println(list);
		
		 list.stream().forEach(m-> System.out.println(m));

	}

}
