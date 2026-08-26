package com.hashcode.set;

public class Driver {

	public static void main(String[] args) {
		
		int hash = 25;
		int capacity = 16;
		int index = hash & (capacity-1);
		
		System.out.println("Hash : " + hash);
		
		System.out.println("Capacity : " + capacity);
		
		System.out.println("Index : " + index);
		
		

	}

}
