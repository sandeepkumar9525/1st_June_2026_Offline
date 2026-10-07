package com.synchronize.method.block;

class FilipKart {
	private int availableMobile = 1;

	public void booking(String name) {
		System.out.println(name + " is chacking mobile availabe");
		synchronized (this) {

			if (availableMobile > 0) {
				try {
					Thread.sleep(2000);
					System.out.println(" is CONFIRMED Mobile.." + name);
					availableMobile--;

				} catch (InterruptedException e) {
					e.printStackTrace();

				}
			} else {
				System.out.println("Sorry : " + name + " Mobile is not Available here");
			}
		}
	}
}

public class MobileBooking {

	public static void main(String[] args) {

		FilipKart st = new FilipKart();

		Thread t1 = new Thread(() -> st.booking("Iphone"));
		Thread t2 = new Thread(() -> st.booking("OPPO"));

		t1.start();
		t2.start();

	}

}
