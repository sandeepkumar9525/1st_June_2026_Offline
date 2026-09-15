package com.overloading;

public class Calculater {
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	void add(double a, double b) {
		System.out.println(a+ b);
	}
	
	//void add(String age, int age) {} not allowed compile- error
		
	

	public static void main(String[] args) {
		Calculater ct = new Calculater();
		
		
		ct.add(4, 10);
		ct.add(2, 5, 9);
		ct.add(12, 5);

		//ct.add("Sandeep", 25); compile- error
		
		
	System.err.println("Methods Overloading");
	}

}
