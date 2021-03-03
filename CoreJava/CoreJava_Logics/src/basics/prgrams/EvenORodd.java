package basics.prgrams;

public class EvenORodd {
public static void main(String[] args) {
	/*int num=5;
	if((num&1)==1){
		System.out.println("odd");
	}else{
		System.out.println("even");
	}*/
	int num=20;
	while(num>1){
		num = num -2;
	}
	if(num==0){
		System.out.println("Even");
	}else{
		System.out.println("odd");
	}
}
}
