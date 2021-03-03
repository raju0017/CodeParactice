package basics.multiThreading;

public class ExtendingThreadClass extends Thread{
	
	private String name = null;
	
	@Override
	public void run(){
		for(int i = 1; i<=100; i++){
			System.out.println(i+"*"+(i+1)+"="+i*(i+1));
		}
	}
	
	public static void main(String[] args) {
		
		ExtendingThreadClass exTClass = new ExtendingThreadClass();
		exTClass.start();
	}

}
