package com.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class Person {
	int id;
	Person(int id){
		this.id=id;
		
		
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	//	return false; five size available here
		
	}
	
	@Override
	public int hashCode() {
		return id%2;
	}
	public static void main(String[] args) {
	
		Set<Person> set = new HashSet<Person>();
		
		Person p1 = new Person(10);
		Person p2 = new Person(12);
		Person p4 = new Person(6);
		Person p5 = new Person(8);
		Person p3 = new Person(14);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		System.out.println(set.size());
		
		
	}

}
