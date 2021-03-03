package basics.prgrams;

public class Run4 {

	public static void main(String[] args) {
		Book b1=new Book(150);
		Book b2=new Book(15);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b1));
	}

}
