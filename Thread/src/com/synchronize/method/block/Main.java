package com.synchronize.method.block;

class PlacementNotes {
	public synchronized void syncMethod() {
		try {
			Thread.sleep(2000);
			System.out.println("[" + Thread.currentThread().getName() + "] - Task completed (methods)...");
			System.out.println("wait for 2sec ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void syncBlock() {
		try {
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (this) {
			System.out.println("[" + Thread.currentThread().getName() + "] Task completed (Methods)..");

		}
	}
}

public class Main {
	public static void main(String[] args) throws InterruptedException {

		PlacementNotes st = new PlacementNotes();

		Thread t1 = new Thread(() -> st.syncMethod(), "Thread -1");
		Thread t2 = new Thread(() -> st.syncMethod(), "Thread -2");

		//long startTime = System.currentTimeMillis();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	//	System.out.println("Total time take by methods " + System.currentTimeMillis() + -startTime + "ms\n");

		Thread t3 = new Thread(() -> st.syncBlock(), "Thread -3");
		Thread t4 = new Thread(() -> st.syncBlock(), "Thread -4");

		t3.start();
		t4.start();
		t3.join();
		t4.join();
	//	System.out.println("Total time take by Block " + System.currentTimeMillis() + -startTime + "ms\n");

	}

}
