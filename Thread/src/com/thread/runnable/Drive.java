package com.thread.runnable;

class Number implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 20; i++) {
			if (i == 5 ||i==12) {

				try {
					System.out.println("Sleeping...");

					Thread.sleep(5000);
					System.out.println("Sleeping time over .. i just woke up ..started again");

				} catch (Exception e) {

				}
			}
			System.out.println(i);

		}

	}

}

public class Drive {

	public static void main(String[] args) {

		Number number = new Number();
		Thread t1 = new Thread(number);
		t1.start();

	}

}
