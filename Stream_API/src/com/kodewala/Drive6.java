package com.kodewala;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Drive6 {
	String name;
	int salary;

	public Drive6(String name, int salary) {
		this.name = name;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		List<Drive6> input = Arrays.asList(new Drive6("Sandeep", 30000), new Drive6("Sarika", 47000),
				new Drive6("Rahul", 34000), new Drive6("Rohit", 50000), new Drive6("Radha", 60000),
				new Drive6("Neha", 55000), new Drive6("Golu", 85000), new Drive6("Rahu", 85000));

		 input.stream().sorted((s1, s2) -> Integer.compare(s2.getSalary(), s1.getSalary())).mapToInt(x -> x.getSalary())
				.distinct().skip(1).findFirst();

//		System.out.println(st.getName() + " and " + st.getSalary());

	}

}
