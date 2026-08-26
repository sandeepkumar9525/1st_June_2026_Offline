package constructor_practice;

public class Demo  extends Object{
	
	
	// constructor
	public Demo() {
		super(); // call the parent class
		System.out.println("the constructor");
	}
	public static void main(String[] args) {
		
		Demo ac = new Demo(); // call automatically
	
	}

}
