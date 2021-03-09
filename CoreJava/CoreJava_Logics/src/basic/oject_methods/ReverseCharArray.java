package basic.oject_methods;

public class ReverseCharArray {
	
	public static void main(String[] args) {
		
		char[] ch = {'a','b','c','a','a','b'};
		
		reverseChar(ch);
	}
	
	
	public static void reverseChar(char[] arr){
		int len = arr.length-1;
		for(int i =0; i<len; i++){
			
			arr[i]=arr[len-i];
			
		}
		
		for(char c : arr){
			System.out.print(c);
		}
		
	}
}
