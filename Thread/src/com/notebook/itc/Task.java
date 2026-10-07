package com.notebook.itc;

public class Task {
	int data;
	boolean isDataAvailable = false;

	public synchronized void produce(int _data) throws InterruptedException {

		while (isDataAvailable) {
			System.out.println("[" + Thread.currentThread().getName() + "] is waiting..");
			wait();

		}
		this.data = _data;
		System.out.println("produced the data : " + data);
		isDataAvailable = true;
		
		System.out.println("Producer notifying the consumer");
		notify();
	}

	public synchronized void consumer() throws InterruptedException {

		while (!isDataAvailable) {
			System.out.println("[" + Thread.currentThread().getName() + "] is waiting..");
			wait();

		}
		System.out.println("consume the data : " + data);
		isDataAvailable = false;
		System.err.println("consumer notifying the Producer");
		notify();
	}
}
