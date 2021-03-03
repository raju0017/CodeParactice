package basics.patterns;
public class H_pattern {

	void h() {
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7;j++){
				if(j==1 || j==7 ){
					
					System.out.print("* ");
				
				}
				else if(j==2 || j==6){
					if(i==4){
						System.out.print("  ");
					}else{
						System.out.print("* ");
					}
				}
				else if(i==3 || i==5){
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
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		H_pattern p = new H_pattern();
		p.h();
	}

}
