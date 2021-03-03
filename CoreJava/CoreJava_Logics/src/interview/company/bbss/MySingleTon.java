package interview.company.bbss;

public class MySingleTon {
	
	/*
	 * Private static variable of the same class that is the only instance of the class.
	 */
	private static MySingleTon myObj;
   
	/**
     * Create private constructor
     */
    private MySingleTon(){
         
    }
    /**
     * Create a static method to get instance.
     */
    public static MySingleTon getInstance(){
        if(myObj == null){
            myObj = new MySingleTon();
        }
        return myObj;
    }
     
    public void getSomeThing(){
        // do something here
        System.out.println("Checking singleto object");
        
    }
     
    public static void main(String a[]){
    	MySingleTon st1 = MySingleTon.getInstance();
    	MySingleTon st2 = MySingleTon.getInstance();
    	
    	System.out.println(st1 == st2);
        st1.getSomeThing();
    }
}
