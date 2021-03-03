package basics.StringHandling;

public class StringComparison {
	
	public static void main(String[] args) {
		
		String s1 = "Nagaraj";
		String s2 = "Nagaraju";
		String s3 = "Nagaraj";
		String s4 = "Java";
		String s5 = new String("Java");
		
		System.out.println(s1.equals(s3));
		System.out.println(s4.equals(s5));
		
	}

}
