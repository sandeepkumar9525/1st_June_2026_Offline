package com.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class SimpleCounter {
	private final ReentrantLock lock = new ReentrantLock();
	private int count = 0;

	public void increment() {
		lock.lock(); // 1. Put the lock on

		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(i); // 2. Safely change the data
			} catch(Exception e) {
				
				lock.unlock(); // 3. Always take the lock off
			}
		}
	} 

	public int getCount() {
		return count;
	}

	public static void main(String[] args) {
		SimpleCounter st = new SimpleCounter();
		st.increment();

	}
}