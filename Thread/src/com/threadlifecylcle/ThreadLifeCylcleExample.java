package com.threadlifecylcle;

class ShareResource {
	
	// Used by wait() and notify()
	public synchronized void waitExample() {
		
		System.out.println(Thread.currentThread().getName() + " is inside waitExample() and going WATING state");

		try {
			wait();// Thread releases the lock and waits indefinitely
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " is wait up!");
	}

	public synchronized void wakeUp() {
		notify(); // Wakes up the waiting thread
	}
}

public class ThreadLifeCylcleExample {
	public static void main(String[] args) throws InterruptedException {
		 
		ShareResource st = new ShareResource();
		
		// 1. Thread for wait() example
		Thread t1 = new Thread(() -> {System.out.println(); st.waitExample();
		   }, " Thread 1");
		
		// 2. Thread for sleep() example
		Thread t2 = new Thread(() -> {System.out.println("Thread -2 going to TIMED_WAITING state using sleep()..");
		
		 try {
			 Thread.sleep(2000); // current thread
			 
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		 System.out.println("Thread -2 woke up from sleep!");
		} ," Thread-2");
		
		
		// 3. Thread for yield() example
		Thread t3 = new Thread(() -> {
		 for(int i =0; i<4; i++) {
			 System.out.println("Thread-3 running loop " + i);
			 Thread.yield(); // Hints to the scheduler to give change to other thread
		 } } , " Thread-3");
		 
		// starting the thread
		t1.start();
		t2.start();
		t3.start();
		
		// Let Thread-1 go into waiting state to notify thread wakes it up
		Thread.sleep(1000);
		System.out.println("Main Thread is going ro notify Thread -1...");
		st.wakeUp();
		
	}

}
