package basics.patterns;
public class O_pattern {
	void o() {
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7;j++){
				if(i==1 || i==7 || i==2 || i==6){
					if(j==2 && (i+j==4 || i+j==8) ){
						System.out.print("* ");
					}
					else if(j==6 && (i+j==8 || i+j==12) ){
						System.out.print("* ");
					}
					else if(j==3 || j==4 || j==5){
						System.out.print("* ");
					}else{
						System.out.print("  ");
					}
				}
				else if(i==3 || i==4 || i==5){
					if(j==1 || j==2 || j==6 || j==7){
						System.out.print("* ");
					} else{
						System.out.print("  ");
					}
				}else{
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
}
