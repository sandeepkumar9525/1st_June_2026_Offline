package code.notebook.string;

public class Test3 {

	public static void main(String[] args) {
	String s1 = "java";
	String s2 = new String("java");
	
	String s3 = s2.intern();
	String s4= "java";
	
	String s5 = new String("javaScript").intern();
	
	System.out.println(s1== s2);
	
	System.out.println(s3== s4);
	
	System.out.println(s5== "javaScript");

	}

}
