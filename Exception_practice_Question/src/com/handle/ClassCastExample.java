package com.handle;

public class ClassCastExample {
	
	ClassCastExample(){
		super();
	}
	
    public static void main(String[] args) {
    	
    	new ClassCastExample();
    	
    	Object obj = "Hello"; // obj actually holds a String
        Integer num = (Integer) obj; // ❌ Wrong cast: String → Integer
        
       System.out.println(num); //ClassCastException
    }
}
