package com.kodewala2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Diserialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		ObjectInputStream ops = new ObjectInputStream(new FileInputStream("st2.tox"));
		Student st2 =new Student("Sar@123", "Sandeep");
		ops.readObject();
		System.out.println("Diserialization.main()");
		System.out.println("Sashd "+st2.getName());
		

	}

}
