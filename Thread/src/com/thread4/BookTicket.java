package com.thread4;

import java.awt.print.Book;

public class BookTicket {

	  int totalSeats = 1;

	public synchronized void bookSeats(String passengerName) {
		System.out.println(passengerName + " is typing to acquier the lock...");

		if (totalSeats >= 1) {
			System.out.println("Success ! " + passengerName + " got the lock. Booking seats");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			totalSeats--;
			System.out.println(passengerName + " 's ticket is booked  .Releasing the lock");
		} else {
			System.out.println("Sorry!  No seats avaiable for " + passengerName);
		}
	
	}

	public static void main(String[] args) {
		BookTicket st = new BookTicket();

		Thread t1 = new Thread(() -> st.bookSeats("Sandeep"));

		Thread t2 = new Thread(() -> st.bookSeats("Radha"));
		
		Thread t3 = new Thread(() -> st.bookSeats("Janu"));
		
		

		t1.start();

		t2.start();
		t3.start();

	}
}
