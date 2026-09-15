package com.notebook;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Kodewala","Academy","Java");
		
		Stream<String> out =list.stream().map(m -> m.toUpperCase());  //.collect(Collectors.toList());
		
		//System.out.println(out);
		
		out.forEach(value -> System.out.println(value));

	}

}
