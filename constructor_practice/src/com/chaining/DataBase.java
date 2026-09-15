package com.chaining;

public class DataBase {
	String dbName;
	String user;
	int passwd;
	
	// call the next constructor
	public DataBase() {
		this("mydb", "root",564);
		
	}
	
	// parameterized constructor
	public DataBase(String dbName, String user, int passwd) {
		this.dbName= dbName;
		this.user= user;
		this.passwd = passwd;
	}
	//method display
	public void display() {
		System.out.println("Db Name : " + dbName);
		System.out.println("User Name : " + user);
		System.out.println("Pass-Word : " + passwd);
	}
	public static void main(String[] args) {
		DataBase db = new DataBase();
		db.display();// user default constructor
		
		System.out.println();
		
		DataBase db2 = new DataBase("Testdb","Admin", 1232); // uses custom values
		db2.display();
		
	}

}
