package basics.java_lang_package;

public class Test {
	
	private int i;
	
	public Test(int i) {

		this.i = i;
	}
	
	@Override
	public int hashCode(){
		
		return i;
	}
	
	@Override
	public String toString(){
		return i+"";
	}
	
	public static void main(String[] args) {
		
		Test t1 = new Test(10);
		Test t2 = new Test(100);
		
		System.out.println(t1);
		System.out.println(t2);
/*		
		// before overriding hashcode() method
 		O/p
		com.basics.java_lang_package.Test@659e0bfd
		com.basics.java_lang_package.Test@2a139a55

		// Afeter overriding hashcode() method
		O/p
		com.basics.java_lang_package.Test@a
		com.basics.java_lang_package.Test@64
		
		// Afeter overriding toString() method
		O/p
			10
			100

*/
		
		
				
	}

}
