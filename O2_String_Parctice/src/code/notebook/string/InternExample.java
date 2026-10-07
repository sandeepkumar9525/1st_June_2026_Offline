package code.notebook.string;

public class InternExample {

	public static void main(String[] args) {
		
		
		String s1 = "kodewala Academy";
		String s2 = new String("kodewala Academy");
		String s3 = s2.intern();
		
		System.out.println("s3==s2 -> intern :" + (s1==s3) );
		
		
		System.out.println("s1== s2:" + (s1==s2));
		

	}

}
