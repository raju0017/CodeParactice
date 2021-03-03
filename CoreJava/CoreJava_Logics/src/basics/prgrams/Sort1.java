package basics.prgrams;

import java.util.Arrays;

public class Sort1 {

	public static void main(String[] args) {
		
		int[] arr={1,3,5,9,7,3,};
		Arrays.sort(arr);
		for(int i: arr){
			System.out.println(i);
		}
		
		
		String[] str={"java","sql","c"};
		Arrays.sort(str);
		for(String s:str){
			System.out.println(s);
		}
	}

}
