package basics.prgrams;

import java.util.Arrays;

public class StringSort1 {

	public static void main(String[] args) {
		String[] s={"abc","pqr","dsfg","cfgm"};
		Arrays.sort(s);
		for(String i:s){
			System.out.println(i);
		}
	}

}
