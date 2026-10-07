package com.notebook;

class MyRunnabletask implements Runnable{

	@Override
	public void run() {
		// code inside this methods  executes in the new  thread
		System.out.println("Thread is runnimng via Running : " + Thread.currentThread().getName());
		
	}
	
}
public class Main {
	public static void main(String[] args) {
		System.out.println("Main Thread START .." + Thread.currentThread().getName());
		
		// Create an instance of your task
		MyRunnabletask sy = new MyRunnabletask();
		
		// Pass the task to a thread object 
		Thread t1= new Thread(sy," 1st");	
		t1.start();
		
		// start the thread automatically  run the methods
		Thread t2= new Thread(sy, " 2nd");	
		t2.start();
		System.out.println("Main Thread END");
		
	}

}
