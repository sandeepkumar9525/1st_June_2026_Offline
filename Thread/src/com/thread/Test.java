package com.thread;

class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Executing run  methods...");
		
		System.out.println("MyThread : This code is executed by{" + Thread.currentThread().getName() + "} thread" );
	}
}
public class Test {

	public static void main(String[] args) {
		
		System.out.println("START main()...");
		
		System.out.println("MyThread : This code is executed by{" + Thread.currentThread().getName() + "} thread" );
		System.out.println("This is my hello world..");
		
		
		MyThread t1= new MyThread();
		t1.start(); // main + t1
		t1.start();
		
		MyThread t2= new MyThread();
		t2.start();// main + t1 + t2
		   
		MyThread t3= new MyThread();		
		t3.start();// main + t1 + t2 + t3
		
		MyThread t4= new MyThread();		
		t4.start();// main + t1 + +t2 + t3 + t4
		
		System.out.println("END main()...");
	}

}
