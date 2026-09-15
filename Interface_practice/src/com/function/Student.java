package com.function;

import java.util.function.Consumer;

public class Student {

	public static void main(String[] args) {
		Consumer<String> st = name -> System.out.println(name);

		st.accept("Sandeep");

		Consumer<String> sp = name -> System.out.println(name);
		sp.accept("Sarika");

		Consumer<String> sd = name -> System.out.println(name.toUpperCase());
		sd.accept("sarika");

		Consumer<Integer> az = n -> System.out.println(n);
		az.accept(199);

		Consumer<Integer> ad = number -> {

			if (number % 2 == 0) {
				System.out.println("Even Number");

			} else {
				System.out.println("Add Number");
			}
		};
		ad.accept(1);
		ad.accept(4);

	}

}
