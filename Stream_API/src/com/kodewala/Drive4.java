package com.kodewala;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Drive4 {
	String name;
	int salary;

	public Drive4(String name, int salary) {
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
		
	List<Drive4> input= Arrays.asList(new Drive4( "Sandeep",30000)
								,new Drive4( "Sarika",47000)
								,new Drive4( "Rahul", 34000)
								,new Drive4( "Rohit",50000)
								,new Drive4( "Radha",60000)
								,new Drive4( "Neha",55000)
								,new Drive4( "Golu",85000)
                             	,new Drive4( "Rahu",85000));
			
		
Drive4 st =	input.stream().distinct().sorted((s1,s2) -> Integer.compare(s2.getSalary(), s1.getSalary()))
	.skip(2).findFirst().get();

	System.out.println(st.getName() +" and " + st.getSalary());
		

	}

}
