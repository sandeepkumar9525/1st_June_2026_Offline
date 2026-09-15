package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDetalis {
	
	String name;
	double salary;
	public EmployeeDetalis(String name, double salary) {
		
		this.name= name;
		this.salary= salary;
		
		
	}

	public static void main(String[] args) {
		
		List<EmployeeDetalis> list = Arrays.asList(new EmployeeDetalis("Sandeep", 1100000),
				new EmployeeDetalis("Radha", 1200000),
				new EmployeeDetalis("Geeta" , 1500000),
				new EmployeeDetalis("Reeta", 900000));
		
		List<String> start = list.stream()
				.filter(s-> s.salary >1000000)
				.map(m -> m.name).collect(Collectors.toList());
		        System.out.println(start);
		
		
		
	}

}
