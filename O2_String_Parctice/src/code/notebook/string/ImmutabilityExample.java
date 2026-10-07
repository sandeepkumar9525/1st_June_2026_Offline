package code.notebook.string;

public class ImmutabilityExample {

	public static void main(String[] args) {
		
		String s1 = "kodewala";
		String s2= s1.concat(" Academy");
		
		// original String remains unchanged
		System.out.println("s1 :" + s1 );
		System.out.println("s2:" + s2);
		
		// memory reference (Address)
		
		System.out.println("Are s1 and s2 the same? "+ (s1==s2));

	}

}
