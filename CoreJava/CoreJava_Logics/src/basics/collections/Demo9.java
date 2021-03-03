package basics.collections;

import java.util.Arrays;
import java.util.Comparator;

public class Demo9 {

	public static void main(String[] args) {
		String[] arr={"java","c","android","c++"};
		Comparator c=new Comparator() {
										public int compare(Object arg0, Object arg1){
											return ((String)arg0).length()-((String)arg1).length();
										}

										

										
									};
				Arrays.sort(arr,c);
				for(String s:arr){
					System.out.println(s);
				}
	}
	

}
