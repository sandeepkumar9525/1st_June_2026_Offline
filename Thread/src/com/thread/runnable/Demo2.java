package com.thread.runnable;

class B implements Runnable {

	@Override
	public void run() {
		for (char a = 'A'; a < 'z'; a++) {
			if (a == 'D') {
				try {
					System.out.println("Sleeping....");
					Thread.sleep(4000);
					System.out.println("Sleeping time over :  i just woke up .. started again");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println(a);
		}

	}

}

public class Demo2 {
	public static void main(String[] args) {
		B b = new B();
		Thread t1 = new Thread(b);
		t1.start();
		
		Thread t2 = new Thread(b);
		t2.start();
	}

}
