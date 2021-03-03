package basics.patterns;
public class M_pattern {

	void m() {
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7;j++){
				if(j==1 || j==2 || j==6 || j==7){
					System.out.print("*  ");
				}else if(i==2  && (i==j || j-i==1 || j-i==3)){
					System.out.print("*  ");
				}else if(i==3){
					System.out.print("*  ");
				}
				else if(i==4  && (i==j)){
					System.out.print("*  ");
				}
				
				else{
					System.out.print("   ");
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(" ");
		}
		
	}
	public static void main(String[] args) {
		M_pattern p = new M_pattern();
		p.m();
	}
		
}
