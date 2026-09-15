package com.builder;

public class Demo {

	public static void main(String[] args) {
		StringBuilder query = new StringBuilder("SELECT = FROM employee WHERE 1=1 " );
		boolean filterByDepartment= true;
		
		if(filterByDepartment) {
			query.append("AND deparment = 'IT'");
		}
		
		boolean filterBySalary = true;
		if(filterBySalary) {
			query.append("AND salary > 50000");
		}
		System.out.println(query.toString());
	}

}
