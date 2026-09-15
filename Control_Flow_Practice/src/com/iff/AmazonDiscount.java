package com.iff;
import java.util.Scanner;
public class AmazonDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount");
		double orderAmount = sc.nextDouble();
		if (orderAmount >= 10000) {
			System.out.println("Dicount Applied : 20%");
		} else if (orderAmount >= 5000) {
			System.out.println("Discount Applied : 15%");
		} else if (orderAmount >= 2000) {
			System.out.println("Discount Applied : 10%");
		} else {
			System.out.println("No Discount Avaiable");
		}
	}

}
