package com.covariant;

public class Parent {
	
	protected void show() {
		System.out.println("Parent.show()");
	}
	
	//final void show1() {};
	
	

}

class Child extends Parent{
	@Override
	public void show() {  // public or protected  allowed
	
	//private void show{  //it is not access allowed , final
		
		System.out.println("Parent.show()");
		
		
		//protected void show1();
		
	}
	
}
