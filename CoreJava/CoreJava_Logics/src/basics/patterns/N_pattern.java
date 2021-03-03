package basics.patterns;
public class N_pattern {
void n() {
	for(int i=1;i<=7;i++){
		for(int j=1;j<=8;j++){
			if(j==1 || j==8 || j==2 || j==7){
				System.out.print("* ");
			}else if(i==j || j-i==1){
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
}
