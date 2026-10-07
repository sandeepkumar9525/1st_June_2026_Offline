package com.thread;

class Number extends Thread {
	@Override
	public void run() {

		for (int i = 0; i <= 20; i++) {
			
System.out.println(i+ " - " + Thread.currentThread().getName()+ "   id: "+ Thread.currentThread().getId());
		}
	}
}

public class Drive2 {

	public static void main(String[] args) {
		
		Number t1 = new Number();		
		Number t2 = new Number();
		
		t1.start();
		t2.start();

	}

}
