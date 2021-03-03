package basics.multiThreading;


public class ImplimentingRunnableInterface implements Runnable{

	@Override
	public void run() {
			
			// logic here
			
			for(int i= 0; i<=100; i++){
				System.out.print(i+" ");
			}
		}
		
		public static void main(String[] args) {
			 
			ImplimentingRunnableInterface implRunInt = new ImplimentingRunnableInterface();
			
			Thread t = new Thread(implRunInt);
			
			t.start();
		
		}
	

}
