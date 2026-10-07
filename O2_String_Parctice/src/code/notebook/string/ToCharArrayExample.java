package code.notebook.string;

public class ToCharArrayExample {

	public static void main(String[] args) {

		String s1 = "kodewala";
		char[] s2 = s1.toCharArray();
		//System.out.println(s2);

		for (char c : s2) {
			System.out.println( "toCharArray :"+c );
		}

	}

}
