package code.notebook.string;

public class TrimExample {

	public static void main(String[] args) {
		String s1 ="             kodewala           ";
		System.out.println("trim :"+s1.trim());
		
		String s2 = "kodewala";
		System.out.println("replace:"+s2.replace('k','S'));
		
		System.out.println();
		
		String s3= "kodewala , Academy, BTM, Banglore";
	
		String[] languages = s3.split(",");
		
		
		for(String lang : languages) {
			System.out.println( "split :"+lang);
		}

	}

}
