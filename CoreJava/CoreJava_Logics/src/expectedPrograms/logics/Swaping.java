package expectedPrograms.logics;

public class Swaping {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before swaping a= "+a+" and b= "+b);
		
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping a= "+a+" and b= "+b);

		
	}

}
