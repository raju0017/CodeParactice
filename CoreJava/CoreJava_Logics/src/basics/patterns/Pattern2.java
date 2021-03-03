package basics.patterns;
public class Pattern2 {
	public static void main(String[] args)
	{
		int num=1;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=9; j++) {
				if(i+j<6 || j-1>4 || i+j==7 || j-i==3 || i+j==9 || j-i==1){
					System.out.print(" ");
				}else{
					System.out.print(num);
					num++;
				}
			}
			System.out.println("");
		}
	}
	

}
