package com.notebook.itc;

public class Main {

	public static void main(String[] args) {
		Task task = new Task();
		
		Produce produce = new Produce(task);
		Consumer consumer = new Consumer(task);
		produce.setName("Producer");
		
		consumer.setName("Consumer");
		
		produce.start();
		consumer.start();

	}

}
