package com.notebook;

import java.util.Arrays;
import java.util.List;

public class ToArrayExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("kodewala","Banglore","btm");
		
		String[] arr = list.stream().toArray(size -> new String[size]);
		System.out.println(Arrays.toString(arr));

	}

}
