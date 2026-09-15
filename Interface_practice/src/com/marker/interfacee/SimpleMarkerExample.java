package com.marker.interfacee;

public class SimpleMarkerExample {

	public  void deleteFile(Object obj) {

		if (obj instanceof Deletable) {
			System.out.println("SUCCESS : File Deleted Successfully!");
		} else {
			System.out.println("ERROR : Access Denied ! this file cannot be Deleted.");
		}
	}

	public static void main(String[] args) {
		TempFile file1 = new TempFile();
		SystemFile file2 = new SystemFile();
		
		SimpleMarkerExample file3 = new SimpleMarkerExample();
		file3.deleteFile(file1);
//		deleteFile(file1);
//		deleteFile(file2);
		
		

	}

}
