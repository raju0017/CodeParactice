package basics.prgrams;

public class Mysingleton {
 
    private static Mysingleton myObj;
     
    static{
        myObj = new Mysingleton();
    }
   
     
    public static Mysingleton getInstance(){
        return myObj;
    }
     
   /* public void testMe(){
        System.out.println("");
    }
     */
    public static void main(String a[]){
       
        for(int i=1;i<3;i++){
        	 Mysingleton ms = getInstance();
        	System.out.println(ms);
       
        }
    }
}
