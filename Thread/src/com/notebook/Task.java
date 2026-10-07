package com.notebook;

class MyTask implements Runnable {

	@Override
	public synchronized void run() {

		for (int i = 0; i < 8; i++) {

			if (i == 3 || i==6) {
				System.out.println("Task Running.. " + i + "  [" + Thread.currentThread().getName() + "]");

			}
		}

	}

}

public class Task {
	public static void main(String[] args) {
		System.out.println("Task Main... START " + Thread.currentThread().getName());
		MyTask task = new MyTask();

		Thread t = new Thread(new MyTask());
		t.start();

		Thread t1 = new Thread(task);
		t1.start();

		System.out.println("Thread is END");

	}
}
