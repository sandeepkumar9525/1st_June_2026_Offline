package com.constructor;

public class Employee {
	String employeeId;
	String employeeName;
	double employeeSalary;

	// default constructor
	public Employee() {
		employeeId = "1234";
	}
	//parameterized constructor
	public Employee(String employeeName, double employeeSalary) {
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public void display() {
		System.out.println("Employee Id :" + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Employee Salary : " + employeeSalary);
	}
	
	
	public static void main(String[] args) {
		Employee em= new Employee("Sandeep", 16900);		
		em.display();
		
		System.out.println();
		
		Employee em2= new Employee();
		em2.display();
		
	}

}
