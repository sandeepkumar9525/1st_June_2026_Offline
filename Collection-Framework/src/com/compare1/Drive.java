package com.compare1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drive {

	public static void main(String[] args) {
		
		Customer p1= new Customer(101,"sandeep");
		Customer p2= new Customer(99,"Rohit");
		Customer p3= new Customer(1204,"Mohan");
		Customer p4= new Customer(322,"Rahul");
		Customer p5= new Customer(23,"Ashu");
		
		List<Customer> list = new ArrayList<>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		Collections.sort(list, new CustomerByIDComparator());
		
		
		for(int i=0; i<list.size(); i++) {
			Customer c= list.get(i);
		
			System.out.println(c.id + " , "+ c.name);
		}
		
	}

}
