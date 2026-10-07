package com.kodewala;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Drive5 {

	public static void main(String[] args) {
	List<String> list = Arrays.asList("Banglore","Mumbai","Chennai","jaypur","Delhi");
	
	
	// single threaded stream
	List<String> out1=	list.stream().filter(w-> w.startsWith("B")).collect(Collectors.toList());
	
	// processing 1 gb data --> s mins
	System.out.println(out1);

	List<String> out=	list.parallelStream().filter(w-> w.startsWith("B")).collect(Collectors.toList());

	System.out.println(out);
	}

}
