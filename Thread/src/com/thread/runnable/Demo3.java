package com.thread.runnable;

class C implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			if (i == 5) {
				try {
					System.out.println("Sleeping.....");
					Thread.sleep(5000);
					System.out.println("Sleeping time over : i just woke up .. started again");
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
			}

			System.out.println(" Printing ... " + i + Thread.currentThread().getName());
		}

	}

}

public class Demo3 {

	public static void main(String[] args) {

		C c = new C();
		Thread t1 = new Thread(c, " [First Thread]");
		t1.start();

		Thread t2 = new Thread(c, " [Sec Thread]");
		t2.start();

	}
}
