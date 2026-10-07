package com.executore.service1;

public class EmailSender {

	String emali;
	String body;

	public EmailSender(String emali, String body) {
		super();
		this.emali = emali;
		this.body = body;
	}

	public Boolean sendingEmail(String email, String body) {
		System.out.println("sending Email to " + email+"[" + Thread.currentThread().getName()+"]");
		try {
//			Thread.sleep(2000);
//			Thread.currentThread().getName();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return true;

	}

}
