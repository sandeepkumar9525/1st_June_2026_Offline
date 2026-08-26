package com.inheritance;

public class Employee {
	public void work() {
		System.out.println("Employee.work()");
		
	}

}
class Developer extends Employee{
	public void code() {
		System.out.println("Developer.code()");
	}
}
class JavaDeveloper extends Developer{
	public void java() {
		System.out.println("JavaDeveloper.java()");
	}
	public static void main(String[] args) {
		JavaDeveloper dv = new JavaDeveloper();
		dv.work();
		dv.code();
		dv.java();
	}
}