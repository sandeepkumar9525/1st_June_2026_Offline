package code.notebook.string;

public class Test {

	public static void main(String[] args) {
		String s1 = new String("kodewala");
		String s2 = new String("kodewala"); // create one object in the heap memory
		String s3 = new String("kodewala");
		
		
		System.out.println(s1==s2); // output -> false
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s3)); // output true , because equal compares content, not references
		

	}

}
