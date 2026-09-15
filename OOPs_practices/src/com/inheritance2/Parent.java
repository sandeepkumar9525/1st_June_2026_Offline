package com.inheritance2;

public class Parent {
	void print(int age) {
		System.out.println("Parent.print()");
	}

}

class Child extends Parent {
	@Override
	void print(int age) {
		System.out.println("child.print()");
	}

	public static void main(String[] args) {
		Parent st = new Child();
		st.print(24);
	}

}
