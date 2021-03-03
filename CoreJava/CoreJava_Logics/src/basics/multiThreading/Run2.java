package basics.multiThreading;
public class Run2 {

	public static void main(String[] args) {
		System.out.println("main( starts");
		new DisplayNum();
		System.out.println("main( ends");
	}

}
class DisplayNum implements Runnable
{
	public DisplayNum(){
		new Thread(this).start();
	}
	public void run(){
		System.out.println("DisplayNum starts");
		for(int i=1; i<=10; i++){
			System.out.println(i);
			try{Thread.sleep(500);}
			catch(Exception e){}
		}
		System.out.println("DisplayNum ends");
	}
}
