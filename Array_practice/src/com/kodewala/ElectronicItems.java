package com.kodewala;

import java.util.Arrays;

public class ElectronicItems {

	public static void main(String[] args) {

		String[] product = { "Laptop", "Smartphone", "Tablet", "Smartwatch", "Headphone" };
		double price[] = { 50000, 12000, 35000, 2000, 1000 };

		int maxPriceIndex = 4;

		for (int i = 0; i < price.length; i++) {
			if (price[i] > price[maxPriceIndex]) {
				maxPriceIndex = i;
			}

		}
		Arrays.sort(price);

		System.out.println(Arrays.toString(price));

		System.out.println("The product with the highest price is : " + price[maxPriceIndex] + " with a price of Rs."
				+ price[maxPriceIndex]);

	}

}
