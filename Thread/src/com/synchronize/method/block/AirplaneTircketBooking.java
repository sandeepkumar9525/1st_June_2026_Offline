package com.synchronize.method.block;

class Task {
	private int availableSeats = 1;

	public synchronized void bookSeat(String passengerName) {
		System.out.println(passengerName + " Is chacking seat availability...");

//		synchronized (this) {

			if (availableSeats > 0) {
				try {

					Thread.sleep(2000);
					System.out.println("Seat CONFIRMED  for : " + passengerName);
					availableSeats--;

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			} else {
				System.out.println("Soryy : " + passengerName + " Flight is full!..");

			}
		}

//	}
}

public class AirplaneTircketBooking {

	public static void main(String[] args) {

		Task task = new Task();
		Thread t1 = new Thread(() -> task.bookSeat("Alice"));
		Thread t2 = new Thread(() -> task.bookSeat("Bob"));
		t1.start();
		t2.start();

	}

}
