package com.notebook;

import java.util.Arrays;
import java.util.List;

public class SortedCostomExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Kodewala","Academy","Banglore");
		
		list.stream().sorted((s1,s2) -> s1.length()- s2.length()).forEach(C -> System.out.println(C));

	}

}
