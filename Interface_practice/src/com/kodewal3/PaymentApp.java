package com.kodewal3;

interface PaymentGateway {
	default void validateTrasaction() {
		log("Validated Trasaction ");
		System.out.println("Trasaction Validated");
	}

	static void checkServiceStatus() {
		System.out.println("Payment Service Active");
	}

	private static void log(String message) {
		System.out.println("[log]" + message);
	}

	void processPayment(double amount);

}

class CrediCardPayment implements PaymentGateway {

	@Override
	public void processPayment(double amount) {
		System.out.println("Paid : " + amount + " Via Credi Card. ");
//	System.out.println("Via Credi Card : " +  );

	}

}

class UPIPayment implements PaymentGateway {

	@Override
	public void processPayment(double amount) {
		System.out.println("Paid :" + amount+ " via UPI.");

	}

}

public interface PaymentApp {

	public static void main(String[] args) {
		PaymentGateway.checkServiceStatus();

		System.out.println();
		
		PaymentGateway st = new CrediCardPayment();
		st.validateTrasaction();
		st.processPayment(5000);

		System.out.println();
		PaymentGateway st2 = new UPIPayment();
		st2.validateTrasaction();
		st2.processPayment(1500);
	}
}