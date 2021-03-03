package basics.patterns;

public class AA_pattern {

	void a() {
		
		
		for(int i=1;i<=6;i++){
			for(int j=1;j<=11;j++){
				if(i==1 && (i+j)==7){
					
						System.out.print("* ");
					
				}
				else if( i>1 && ((i+j)==7 || (i+j)==8 || (j-i)==5 || (j-i)==4)){
					System.out.print("* ");
					
					
				}else if(i==4 && (i+j==9 || i+j==10 || i+j==11)){
					System.out.print("* ");
				}
				else if(i==5 && (i+j==9 || i+j==10 || i+j==11 || i+j==12 || i+j==13 )){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
				
				
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		AA_pattern p = new AA_pattern();
		p.a();
	}

	}

