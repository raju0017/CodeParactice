package basics.multiThreading;
public class Run1 {

	public static void main(String[] args) {
		System.out.println("main starts");
		Thread t1=new PrintNum();
		t1.start();
		Thread t2=new PrintChar();
		t2.start();
		System.out.println("main ends");
	}

}
class PrintNum extends Thread
{
	public void run(){
		System.out.println("PrintNum Starts");
		for(int i=1; i<=10; i++){
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
			
		}
		System.out.println("PrintNum ends");

	}
}
class PrintChar extends Thread
{
	public void run(){
		System.out.println("Print Char Starts");
		for(char c='A'; c<='J'; c++){
			System.out.println(c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println("PrintChar ends");
	}
}					