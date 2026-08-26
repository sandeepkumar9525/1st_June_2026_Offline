package com.hashcode.set2;

import java.util.HashSet;
import java.util.Set;

class Employee1{
	private String name;
	private int id;
	public Employee1(String name, int id) {
		super();
		this.name = name;
		this.id= id;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.id;
		
	}
	@Override
	public boolean equals(Object obj) {
		Employee1 emp = (Employee1) obj;
		return this.name.equals(emp.name)& this.id== emp.id;
	}
}
public class Driver {

	public static void main(String[] args) {
		Set<Employee1> employee = new HashSet<>();
		
		Employee1 e1= new Employee1("Sandeep",123);
		Employee1 e2 = new Employee1("Sandeep",4321);
		
		System.out.println("e1 : " + e1.hashCode() + " e2 : " + e2.hashCode());
		
		employee.add(e1);
		employee.add(e2);
		System.out.println(e1.equals(e2));
		System.out.println(employee);// both will be Stored

	}

}
