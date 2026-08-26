package com.inheritance1;

public class SBI {
	private String name;
	private double salary;
	public SBI(String name, double salary) {
		this.name= name;
		this.salary= salary;
	}
	public String getName() {
		return name;
		
	}
	public double getSalary() {
		return salary;
	}
	
	public void calculateInstrest() {
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}

}
class EmployeeInfo extends SBI{
	
	public EmployeeInfo(String name, double salary) {
		super(name, salary);
		
		
	}
	public void calculateInstrest() {
		double totalSalary = getSalary()*5/100;
		System.out.println("Employee Name : " + getName());
		System.out.println("Basic Salary : " + getSalary());
	
		System.out.println("Interst : " + totalSalary);
		
	}
	public static void main(String[] args) {
		SBI st = new EmployeeInfo("Sarika Kumar", 22000 );
		st.calculateInstrest();
	}
	
	
}