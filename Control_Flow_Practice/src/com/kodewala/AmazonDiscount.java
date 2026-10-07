package com.kodewala;

public class AmazonDiscount {

	public static void main(String[] args) {

		double amount = 5001;

		if (amount > 10000) {
			System.out.println("Discount applied :20%");
		} else if (amount > 5000) {
			System.out.println("Discount Applied : 15%");
		} else if (amount > 2000) {
			System.out.println("Discount Applied : 10%");
		} else {
			System.out.println("No Discount Applied");
		}
	}

}
