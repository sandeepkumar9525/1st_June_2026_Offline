package com.notebook.itc;

public class Produce extends Thread {
	Task task;

	public Produce(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				task.produce(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
