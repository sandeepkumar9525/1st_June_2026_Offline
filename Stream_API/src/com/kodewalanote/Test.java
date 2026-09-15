package com.kodewalanote;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<String> name = Arrays.asList("kodewala","Academy","Java","Pring","Tream");
		System.out.println(name);
		
		List<String> nam = name.stream().filter( d -> d.length()>5)
				.map(f->f.toUpperCase())
				.sorted()
				.collect(Collectors.toList());

		System.out.println(nam);
		
		
		
		System.err.println("Parallel Stream Output");
		
		name.parallelStream().forEach(item -> System.out.println(Thread.currentThread() + "-" +item));
	}

}  
