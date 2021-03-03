package interview.company.ubn_swSolutions;

public class EqualsMethod_Test {

	public  static void main(String[] args) {
		String s1 = new String("Abc");
		String s2 = "Abc";
		System.out.println(s1.hashCode()); // 65602
		System.out.println(s2.hashCode()); // 65602
		System.out.println(s1.hashCode()==s2.hashCode()); // true -->i said false
	}
	
	
}
