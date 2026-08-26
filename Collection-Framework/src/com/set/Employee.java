package com.set;

import java.util.Set;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
	String name;
	int id;

	public Employee(String name, int id) {
		super();
		this.id = id;
		this.name = name;

	}

	@Override
	public int compareTo(Employee o) {
		int result = Integer.compare(this.id, o.id);
		System.out.println(this.id+ " " + o.id + " and result is " + result);
		return result;
	}
 

	public static void main(String[] args) {
		
		Set<Employee> set = new TreeSet<Employee>();

		set.add(new Employee("Sandeep", 123));
		set.add(new Employee("Rohit", 12));
		set.add(new Employee("Rohit", 12));
		set.add(new Employee("Mohan", 412));
		
		
		for (Employee employee : set) {
			System.out.println(employee.id + " ," +employee.name );
			
		}
		System.out.println(set);

	}

}
