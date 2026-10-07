package code.notebook.string;

public class StringExample {

	public static void main(String[] args) {
	
		String s1= "kodewala";
		String s2 = "kodewala"; // kodewala -> store SCP
		String s3= "kodewala";
		
		System.out.println(s1==s2); // compare to reference
		System.out.println(s1==s3);
		
		System.out.println(s2.equals(s3)); // compare to constant value

	}

}
