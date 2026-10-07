package com.thread3;

public class TicketCounter {
	private int availableSeats = 5;

	public synchronized void bookTicket(String passenger, int seats) {
		System.out.println(passenger + " is trying to book.. " + seats + " seat(s)");

		if (availableSeats >= seats) {

			availableSeats = availableSeats - seats;
			System.out.println(passenger + " Booking Successful.. ");
			System.out.println("Remaining available Seats.. : " + availableSeats);

		}
		else {
			System.err.println("Booking Failed :");
			System.err.println("Not enough seats available");
			
		}
	}

}