package code.notebook.string;

public class SearchingExample {

	public static void main(String[] args) {
		String s1 = "kodewala";
		System.out.println("indexOf :"+s1.indexOf("k"));
		
		
		
		String s2 = "kodewalaAcademy";
		System.out.println("lastIndexOf :"+s2.lastIndexOf("A"));
		
		
		String s3 = "kodewala";
		System.out.println("substring :"+s3.substring(4));
		
		String s4 = "kodewala";
		System.out.println("substring(int beginIndex) :"+s4.substring(0, 4));
				
	}

}
