package com.thread3;

public class RailwayTicket {

	public static void main(String[] args) throws InterruptedException {
		TicketCounter counter = new TicketCounter();
		
		
		Passenger t1 = new Passenger(counter, 2);
		Passenger t2 = new Passenger(counter, 1);
		Passenger t3 = new Passenger(counter, 3);
				
		
		t2.setName("Sandeep");	
		t2.start();
		t2.join();
		
		t1.setName("Rohit");
		t3.setName("Radha");
		
		t1.start();
		t3.start();

	}

}
