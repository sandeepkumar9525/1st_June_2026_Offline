package com.diamond.problem;

public interface InterfaceA {

	default void shoMessage() {
		System.out.println("Hello from InterfaceExample");
	}

}

interface InterfaceB {
	default void shoMessage() {
		System.out.println("Hello from InterfaceExample");
	}
}
// Class implements both interface create a conflict (diamond Problem)
class MyClass implements InterfaceA, InterfaceB {
	
	// Crucial step: we must @Oerride the duplicate methods to resolve ambiguity   
	@Override
	public void shoMessage() {
		System.out.println("Resolved  inside MyCalss");
		InterfaceA.super.shoMessage();
	}

	public static void main(String[] args) {
		// create an object of methods
		InterfaceA st = new MyClass();
		
		st.shoMessage();
	}
}