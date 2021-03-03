package interview.company.bel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMerge {

	int[] a = new int[]{1,4,7,9,1,36, 67};
	int[] b = new int[]{2,3,5,9,1,77, 67};
	
	int[] c = new int[a.length+b.length];
	public static void main(String[] args) {
	
		int[] a = new int[]{1,4,7,9,1,36, 67};
		int[] b = new int[]{2,3,5,9,1,77, 67};
		
		List list = new ArrayList<>(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		
		Object[] obj = list.toArray();
		
		System.out.println(Arrays.toString(obj));
	}
	
}
