package basics.collections;

interface Annonymous {
	
	void m1();
	
}
 class Demo8{
	public static void main(String[] args){
		Annonymous a = new Annonymous(){
			public void m1(){
			System.out.println("m1 in annonymous");
			}
		};
		a.m1();
	}
 }
