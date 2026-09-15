package com.compare2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
	Employee e1= new Employee(101, "Sandeep" , 120000);
	Employee e2= new Employee(22, "Rohit" , 70000);
	Employee e3= new Employee(50, "Rahul" , 20000);
	Employee e4= new Employee(99, "Monu" , 50000);
	Employee e5= new Employee(50, "sonu" , 30000);
	Employee e6= new Employee(80, "Golu" , 99000);
	
	List<Employee> list = new ArrayList<Employee>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	list.add(e5);
	list.add(e6);
	
	Collections.sort(list, new NameComparator());
	Collections.sort(list, new SalaryComparator());
	
	
	for(int i= 0; i<list.size(); i++) {
		Employee s= list.get(i);
		System.out.println( s.name+ " , "+ s.salary);
		
	}
	

	}

}
