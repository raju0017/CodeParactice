package interview.company.indiaBix;

public class Bitwise {
	public static void main(String [] args) 
    {
        int x = 11 & 9; // 1011 NAD 1001 = 1001
        
        System.out.println(x);
        int y = x ^ 3; // 1001 XOR 0011 = 1010
        System.out.println(y);
        System.out.println( y | 12 ); // 1010 OR 1100 = 1110
    }

}
