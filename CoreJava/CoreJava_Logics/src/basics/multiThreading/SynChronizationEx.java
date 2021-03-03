package basics.multiThreading;

public class SynChronizationEx {

	public void method1(){
		
		synchronized (SynChronizationEx.class) {
			
			for(int i=0; i<=100;i++){
				System.out.println(i);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		SynChronizationEx sync = new SynChronizationEx();
		sync.method1();
		
		Object o = new Object();
	}
}
