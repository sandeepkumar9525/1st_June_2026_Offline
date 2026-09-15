package com.notebook;

import java.util.Arrays;
import java.util.List;

public class PeakExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc","def");
		
		list.stream().peek(value -> System.out.println("Peeking:" + value)).forEach(s -> System.out.println("Final :"+s));;

	}

}
