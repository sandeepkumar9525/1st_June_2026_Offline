package com.iterator;

import java.util.ArrayList;

import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> car = new ArrayList<>();
		
		car.add("Maruti");
		car.add("Tata");
		car.add("Mahindra");
		
		Iterator<String> itr = car.iterator();
		while(itr.hasNext()) {
			String st= itr.next();
			System.out.println(st);
			
			if(st.equals("Tata")) {
				itr.remove();
			}
		}
		System.out.println(car);
		
	}

}
