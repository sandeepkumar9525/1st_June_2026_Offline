package com.notebook;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Kodewala","Academy","Test","banglore");
		
		List<String> out= list.stream().skip(2).collect(Collectors.toList());
		
		System.out.println(out);

	}

}
