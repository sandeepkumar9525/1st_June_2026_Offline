package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	public static void main(String[] args) {

		List<String> employees = Arrays.asList("Neha", "Radha","Sita", "Gita", "Reeta", "Sandeep");
		
		List<String> strat = employees.stream().map(w -> w.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("Employee Name UpperCase : " +strat );

	}

}
