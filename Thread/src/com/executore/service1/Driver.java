package com.executore.service1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<Boolean> {

	EmailSender emailSender;

	Task(EmailSender emailSender) {
		this.emailSender = emailSender;
	}

	@Override
	public Boolean call() {
//		System.out.println("Executing call()..");
		return emailSender.sendingEmail(emailSender.emali, emailSender.body);

	}

}

public class Driver {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// executor service

		System.out.println("Main -- START");

		// Decided it me
//		ExecutorService st = Executors.newFixedThreadPool(5);

		// Decided it automatically
//		ExecutorService st = Executors.newCachedThreadPool();

		// single Thread
		ExecutorService st = Executors.newSingleThreadExecutor();

		for (int i = 0; i <= 100; i++) {
			EmailSender emailSender = new EmailSender("sk123432@gmail.com", +i + "this is email body " + i);
			Task task = new Task(emailSender);

			Future<Boolean> future = st.submit(task);
//		System.out.println("email status is : " + future.get());

		}
		System.out.println("Main END.....");
		st.shutdown();
	}

}
