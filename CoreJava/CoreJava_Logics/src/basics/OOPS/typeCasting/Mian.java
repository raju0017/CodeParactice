package basics.OOPS.typeCasting;

class A {
	//Type Casting is two types 1.UpCasting 2.DownCasting
	
	public void m1(){
		System.out.println( "m1() from super calss");
	}

}

class B extends A{
	
	public void m2() {
		System.out.println("m2() form sub class");
	}
	/*public void m1(){
		System.out.println( "m1() from sub calss");
	}
	*/
}

public class Mian{
	
	public static void main(String[] args) {
		
		A a1 = new B();
		a1.m1();
//		a1.m2();   when subclass instance is upcasted we can not call suclass functions, to call sub
//				class features Downcasting is mandatory
		
		B b1 = (B)a1;
		b1.m2();
		
	}
	
}
