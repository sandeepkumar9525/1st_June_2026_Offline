package com.kodewala2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExam {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Student st = new Student("St1@123", "Sandeep");
		
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("File.text"));
	oos.writeObject(st);
	System.out.println("SerializationExam.main() is done");
	}

}
