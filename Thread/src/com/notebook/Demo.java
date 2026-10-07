package com.notebook;
class MyCustomThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread is running via subclass : " + "["+ Thread.currentThread().getName()+"]");
	}
}
public class Demo {
public static void main(String[] args) {
	System.out.println("Demo Methods START.." + Thread.currentThread().getName());
	
	MyCustomThread st = new MyCustomThread();
	Thread t1 = new Thread(st,"1st");
	t1.start();
	
	Thread t2 = new Thread(st ," 2nd");
	t2.start();
	System.out.println("Thread is end");
	
}
}
