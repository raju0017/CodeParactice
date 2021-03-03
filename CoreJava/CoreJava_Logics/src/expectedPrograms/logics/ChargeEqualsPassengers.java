package expectedPrograms.logics;


public class ChargeEqualsPassengers {
	public static void main(String[] args) {
		for (int i = 1; i <7; i++) {
			for (int j = 1; j < 10; j++) {
				for (int l = 1; l < 40; l++) {
					if(i*3+j*2+l*0.5==20&&i+j+l==20)
					{
						System.out.println(i+" "+j+" "+l );
					}
					
				}
				
			}
			
		}
	}

}
