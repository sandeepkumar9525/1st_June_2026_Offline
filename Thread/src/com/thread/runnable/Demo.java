package com.thread.runnable;

class A implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 16; i++) {

			if (i == 1) {
				try {
					System.out.println("Sleeping..");
					Thread.sleep(5000);
					System.out.println("Sleeping time over : i just woke up ..started again");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			System.out.println(i);
		}

	}

}

public class Demo {

	public static void main(String[] args) {

		A a = new A();
		Thread t1 = new Thread(a);
		t1.start();

	}

}
