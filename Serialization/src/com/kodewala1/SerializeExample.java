package com.kodewala1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeExample {

	public static void main(String[] args) {
		try {
			Student s1 = new Student("Sandeep", 23, "ST@1234");
			//file and object in stream open do it.
			FileOutputStream fos = new FileOutputStream("student.text");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			
			// object to file in write serialization
			out.writeObject(s1);
			
			//close the stream
			out.close();
			fos.close();
			System.out.println("object student .text save ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
