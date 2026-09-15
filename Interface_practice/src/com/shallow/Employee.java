package com.shallow;

public class Employee implements Cloneable {
	String id;

	public Employee(String id) {

		this.id = id;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {    
		return super.clone();
	}
}

class EmployeeDetalis implements Cloneable { 
	
	String name;
	Employee empr;

	public EmployeeDetalis(String name, Employee empr) {
		this.name = name;
		this.empr = empr;

	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		EmployeeDetalis s= (EmployeeDetalis) super.clone();
		// deep cloning
		s.empr=(Employee) s.clone();
		
		return s;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee st = new Employee("@1234");
		EmployeeDetalis ed= new EmployeeDetalis("Rohit", st);
		
		EmployeeDetalis ed2 =(EmployeeDetalis) ed.clone();
		
		ed.empr.id = "Mohid";
		System.out.println(ed.empr.id);
		//System.out.println(ed2);
		
		
	}
	
}