package com.function;

import java.util.function.Supplier;

public class Employee {

	public static void main(String[] args) {
		Supplier<String> sy =()-> "Sandeep";
		System.out.println(sy.get());
		
		Supplier<Integer> as = ()-> 100;
		System.out.println(as.get());
		
		Supplier<String> s = () -> java.time.LocalTime.now().toString();
		System.out.println(s.get());
		
		
		Supplier<String> d= () -> "Welcome to Banglore";
		System.out.println(d.get());
		
		Supplier<Double> math = () -> Math.random();   
		System.out.println(math.get());
	}

}
