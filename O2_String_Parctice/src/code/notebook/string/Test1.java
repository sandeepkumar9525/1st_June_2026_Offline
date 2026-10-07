package code.notebook.string;

public class Test1 {

	public static void main(String[] args) {
		
		// using String literal
		String s1= "kodewala";
		String s2= "kodewala";
		
		// using the new keyword
		String s3 = new String("kodewala");
		String s4 = new  String("kodewala");
		
		// comparing memory address
		System.out.println("s1==s2 :" + (s1==s2));
		System.out.println("s3== s4 :" +( s3==s4));
		System.out.println("s1==s3 :" + (s1==s3));
		
		System.out.println();
		// comparing content. meaningfully equal or not.
		System.out.println("s1.equals(s2) :" + s1.equals(s2));	
		System.out.println("s3.equals(s4): " + s3.equals(s4));
		System.out.println("s1.equals(s3):" + s1.equals(s3));
		
		
	}

}
