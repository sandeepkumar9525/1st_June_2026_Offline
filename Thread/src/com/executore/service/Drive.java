package com.executore.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread {

	int taskId;

	@Override
	public void run() {
		System.out.println("MyThread.run().. task is " + taskId + " [" + Thread.currentThread().getName() + "]");

	}

	public MyThread(int taskId) {

		this.taskId = taskId;

	}
}

public class Drive {

	public static void main(String[] args) {

		ExecutorService ex = Executors.newFixedThreadPool(15);
		for (int i = 0; i < 10; i++) {
			MyThread t1 = new MyThread(i);
			ex.execute(t1);
		}
		ex.shutdown();
	}

}
