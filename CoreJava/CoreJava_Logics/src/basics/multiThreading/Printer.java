package basics.multiThreading;

public class Printer {
	synchronized void print(String s)
	{
		System.out.println("[");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
			try{Thread.sleep(500);}catch(Exception e){}
		}
		System.out.println("]");
	}

}
class PrintThread implements Runnable
{
	Printer p;
	String s;
	PrintThread(Printer p, String s){
	this.p=p;
	this.s=s;
	new Thread(this).start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
class  Run12
{
	public static void main(String[] args){
		Printer p= new Printer();
		new PrintThread(p, "jspiders");
		new PrintThread(p, "bangalore");
		new PrintThread(p, "java");

	}
}
