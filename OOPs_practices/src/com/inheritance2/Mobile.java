package com.inheritance2;

public class Mobile { //parent class/ superclass
	void start() {
		System.out.println("OPPO.start()");
	}
}


class Nokiya extends Mobile{ //  Nokiya is-a Mobile F
	@Override
	void start() {
		System.out.println("Nokiya.start()");
	}



	public static void main(String[] args) {
		
		Mobile mb = new  Nokiya();// upcasting
		
		mb.start();
		
		Nokiya sd =(Nokiya) mb;
		sd.start();
		
		
		
	}

}
