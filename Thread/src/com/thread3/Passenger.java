package com.thread3;

public class Passenger extends Thread {
	private TicketCounter counter;
	private int seats;
	
	public Passenger(TicketCounter counter, int seats) {
		super();
		this.counter = counter;
		this.seats = seats;
	}
	@Override
	public void run() {
		counter.bookTicket(Thread.currentThread().getName(), seats);
	}
	

}
