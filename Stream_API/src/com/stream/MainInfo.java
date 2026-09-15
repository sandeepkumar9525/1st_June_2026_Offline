package com.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainInfo {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("one", "tow", "three", "four", "five", "one", "tow", "three", "four", "five");


		Set<String> set = new HashSet<String>();
		
		name.stream().filter(n-> !set.add(n)).forEach(s -> System.out.println(s));

	}

}
