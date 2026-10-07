package com.handle;

import java.io.IOException;

public class Demo3 {
	boolean fileMissing;
	public static void print(boolean fileMissing) throws IOException {

		if (fileMissing) {
			throw new IOException("Error: the requested file could not be found");
		}
		System.out.println("File is ready and available");
	}

	public static void main(String[] args) {

		try {
			print(false);
		} catch (IOException e) {

			System.out.println("Caught exception in main :" + e.getMessage());

		}

	}

}
