package com.thread;

class EmailSender extends Thread {

	@Override
	public void run() {

		// when thread is in RUNNING state;
		// thread is doing work/task;
		// from RUNNING to WAITING /BLOCKED;
		// once waiting over thread moved to RUNNABLE state;
		// once CPU allows, thread moved to RUNNING state;
		// once run methods is completed by thread, the is move TERMINATED(Dead) STATE

		System.out.println("Sending email...." + Thread.currentThread().getName());
	}
}

public class Drive {

	public static void main(String[] args) {

		// ONCE thread object is create State = NEW

		EmailSender t1 = new EmailSender();

		// state = RUNNABLE
		
		t1.start(); // NEW ---> RUNNABLE
		
		t1.start();

		// once CUP give time to executed /run then state will be RUNNING

	}

}
