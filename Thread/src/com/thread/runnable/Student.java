package com.thread.runnable;

class Tasks {

	public synchronized void print() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Printing  is.." + i + "  [" + Thread.currentThread().getName() + "]");

		}
	}

}

class Numbers extends Thread {

	Tasks task;

	public Numbers(Tasks task) {
		this.task = task;

	}

	@Override
	public void run() {
		task.print();
	}
}

public class Student {

	public static void main(String[] args) {

		Tasks task = new Tasks();
		Numbers t1 = new Numbers(task);
		t1.setName("1st");
		t1.start();

		Tasks task2 = new Tasks();
		Numbers t2 = new Numbers(task2);
		t2.setName("2nd");
		t2.start();

	}

}
