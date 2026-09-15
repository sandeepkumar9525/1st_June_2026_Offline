package com.inheritance1;

public class A {
	
	 void print() {
		System.out.println("A.print()");
	}
}

class B extends A{
	@Override
	void print() {
		System.out.println("B.print()");
	}
}
class C extends A{
	@Override
	void print() {
		System.out.println("C.print()");
	}
	
	public static void main(String[] args) {
		A st = new C();
		st.print();
	}
}