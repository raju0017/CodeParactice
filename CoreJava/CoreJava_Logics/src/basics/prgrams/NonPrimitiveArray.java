package basics.prgrams;

public class NonPrimitiveArray {

	public static void main(String[] args) {
		String[] arr=new String[3];
		arr[0]="abc";
		arr[1]="xyz";
		arr[2]="pqr";
		for(String s:arr){
			System.out.println(s);
		}
	}

}
