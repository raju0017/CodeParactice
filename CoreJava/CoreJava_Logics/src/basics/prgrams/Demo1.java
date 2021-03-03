package basics.prgrams;

public class Demo1 {
	static void num(int n){
		if(n<=10){
			System.out.println(n);
			num(n+1);
		}
	}

	public static void main(String[] args) {
		num(1);
	}

}
