package com.thread.runnable;

class TaskInfo {
	public synchronized void printNumbers() { // synchronized ke help se is methods ko ek bar may one thread hi run
												// karega
		for (int i = 0; i < 15; i++) {

			System.out.println("Printing.." + i + "-> " + "[" + Thread.currentThread().getName() + "]");
		}

	}
}

class ThreadNumber extends Thread {

	TaskInfo task;

	public ThreadNumber(TaskInfo task) {
		this.task = task;

	}

	@Override
	public void run() {
		task.printNumbers();

	}
}

public class NumberInfo {

	public static void main(String[] args) {
		TaskInfo task = new TaskInfo();

		ThreadNumber t1 = new ThreadNumber(task);

		ThreadNumber t2 = new ThreadNumber(task);

		t1.setName("First");
		t1.start();
		t2.setName("2nd");
		t2.start();
	}
}