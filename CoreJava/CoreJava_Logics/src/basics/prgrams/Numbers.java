package basics.prgrams;

public class Numbers {
	int i=1;
	void show(int n){
		if(i<=n){
		System.out.print(i+" ");
		i++;
		
		show(10);
		}
		
	}

	public static void main(String[] args) {
		Numbers ob=new Numbers();
			ob.show(10);
			}
}
