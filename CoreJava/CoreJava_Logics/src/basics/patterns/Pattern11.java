package basics.patterns;
public class Pattern11 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			int n=0;
			for (int j = 1; j <= 7; j++) {
				
				if (i + j < 5 || j-i>3) {
					System.out.print(" ");
				}else{
					if(j<5)
						System.out.print(++n);
					else
						System.out.print(--n);
					
				}
			}
			System.out.println("");
		}
	}
}
