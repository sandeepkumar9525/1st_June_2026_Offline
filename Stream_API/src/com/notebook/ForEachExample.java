package com.notebook;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Banglore","BTM","Kodewala","Academy");
		
		list.stream().map(m -> m.toUpperCase()).forEach(k -> System.out.println(k));

	}

}
