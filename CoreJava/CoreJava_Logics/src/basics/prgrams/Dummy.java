package basics.prgrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Dummy {

	public static void main(String[] args) throws IOException {
			System.out.println("Enter..........");
		InputStreamReader o=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(o);
		
		 
		System.out.println(br.read());
	}

}
