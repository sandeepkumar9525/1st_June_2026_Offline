package com.kodewala1;

import java.util.Arrays;
import java.util.List;

public class Student {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sachin","Rahul","Virat Kohli","Rohit");
			
		list.stream().filter(w-> w.startsWith("R")).forEach(s-> System.out.println(s));
	}

}
