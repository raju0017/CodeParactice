package basics.prgrams;



public class ReverseString {
	public static void main(String[] args) {
		String n="Mohan";
		String words[]=n.split("");
				for(int i=words.length-1;i>=0;i--){
					System.out.print(words[i]+" ");
				}
		
		
		}
}


/*public class NumberReverse {
	 
    public int reverseNumber(int number){
         
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
    }
     
    public static void main(String a[]){
        NumberReverse nr = new NumberReverse();
        System.out.println("Result: "+nr.reverseNumber(17868));
    }
}*/



/*public class ReverseString {
 
    String reverse = "";
     
    public String reverseString(String str){
         
        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }
     
    public static void main(String a[]){
        ReverseString srr = new ReverseString();
        System.out.println("Result: "+srr.reverseString("Java2novice"));
    }
}*/
