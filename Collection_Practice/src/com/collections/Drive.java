package com.collections;
import java.util.List;
import java.util.ArrayList;
public class Drive {
	int id;
	String name;
	int age;

	public Drive(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}
	@Override
	public boolean equals(Object obj) {
		Drive dv = (Drive) obj;
		
		return this.id == dv.id;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	
public static void main(String[] args) {
		List<Drive>list = new ArrayList<>();
		
		Drive st1 = new Drive(12,"Sandeep", 24);
		Drive st2 = new Drive(12,"Rohit", 27);
		list.add(st1);
		list.add(st2);
		System.out.println(list.hashCode());
		
		System.out.println("s1 hsahCode : "+st1.hashCode() + " s2 hashCode : " + st2.hashCode());
	}

}
