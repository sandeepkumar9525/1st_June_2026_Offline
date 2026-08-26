package constructor_practice;

public class Database {
	// instance variables
	String dbName;
	String user; 
	String password;
	
	//default constructor
	public Database() {
		this("mydb", "root","admin123");
	}
	
	
	// parameterized constructor
	public Database(String dbName, String user, String password) {
		this.dbName= dbName;
		this.user = user;
		this.password= password;
		connect();
		
	}
	//methods connect
	void connect() {
		System.out.println("Connceting to DB : " + dbName+ "\n" + user + "\n"+ password);
	}
	
	public static void main(String[] args) {
		Database dt = new Database();// User the Default value
		
		//dt.connect();
		Database st= new Database("test", "admin","pass123");// User custom values
		//st.connect();
	}

}
