package com.inheritance1;

public class Employee {
	// instance variables
	private String name;
	private double salary;

	// parameterized constructor
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;

	}

	// getter for salary
	public double getSalary() {
		return salary;

	}

	// Getter for name
	public String getName() {
		return name;

	}

	public void calculateSalary() {
		System.out.println("Employee Name : " + name);
		System.out.println("Emlopyee Salary : " + salary);
	}

}

class Manager extends Employee {
	double bonus;

	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;

	}

	@Override
	public void calculateSalary() {
		double totalSalary = getSalary() + bonus;
		System.out.println("Manager Name : " + getName());
		System.out.println("Basic Salary : " + getSalary());
		System.out.println("Bonus : " + bonus);
		System.out.println("Total Salary : " + totalSalary);
	}

}

class Developer extends Employee {
	double incentive;

	public Developer(String name, double salary, double incentive) {
		super(name, salary);
		this.incentive = incentive;

	}

	@Override
	public void calculateSalary() {
		double totalSalary = getSalary() + incentive;
		System.out.println("Developer Name : " + getName());
		System.out.println("Basic Salary : " + getSalary());
		System.out.println("Incentive : " + incentive);
		System.out.println("Total Salary : " + totalSalary);

	}

	public static void main(String[] args) {
		Employee em = new Employee("Sandeep Kumar", 85000);
		em.calculateSalary();

		System.out.println();

		Employee em2 = new Manager("Sarika kumari", 500000, 5000);
		em2.calculateSalary();

		System.out.println();

		Employee em3 = new Developer("Rozi khatoon", 51000, 3000);
		em3.calculateSalary();
	}

}