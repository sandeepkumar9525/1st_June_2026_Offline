package com.kodewala;

public class Filipkart {

	public static void main(String[] args) {

		double amount = 2100;
		if (amount > 5000) {
			System.out.println("Fee Shipping");

		} else if (amount > 2000) {
			System.out.println("100 Rupies Shipping Fee");
		} else {
			System.out.println("200 Rupies Shipping Fee");
		}

	}

}
