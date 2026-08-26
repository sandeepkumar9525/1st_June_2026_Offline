package com.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	int id;
	public Employee(int id) {
		this.id= id;
		
	}
@Override
public boolean equals(Object obj) {
	if(!( obj instanceof Employee))return false;
	
	return id==((Employee) obj).id;
	
}
@Override
public int hashCode() {
	return id;
}

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>();
		
		Employee p= new Employee(10);
		
		set.add(p);
		p.id = 20;
		System.out.println(set.contains(p));
		
	}

}
