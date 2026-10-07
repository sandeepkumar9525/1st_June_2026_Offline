package com.thread.runnable;

import java.util.ArrayList;

//class Task extends ArrayList implements Runnable {   it is allowed 
class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Task.run()...."+Thread.currentThread().getName());

	}

}

public class Test {

	public static void main(String[] args) {

		System.out.println("Task.run() START");
		Task task = new Task();

		Thread t1 = new Thread(task);

		t1.start();

		System.out.println("Task.run() END");

	}

}
