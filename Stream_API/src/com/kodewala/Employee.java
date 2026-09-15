package com.kodewala;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Rahul", 33000)
				, new Employee("Sandeep",400000)
				, new Employee("Geeta",24000)
				, new Employee ("Radha", 30000));
		

				list.stream()
				.filter(s -> s.salary>25000 )
				.forEach(e -> System.out.println("Name :" + e.name + ", Salary : " + e.salary));
					

				System.out.println(list);


	}

}
