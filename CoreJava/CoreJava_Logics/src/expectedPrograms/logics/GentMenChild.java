package expectedPrograms.logics;
public class GentMenChild {
	public static void main(String[] args) {
		//int G=3,l=2,c=(1/2);
		for(int i=1;i<=20;i++){
			for(int j=1;j<=20;j++){
				for(int k=1;k<=20;k++){
					if((k*(0.5)) + (j*2) + (i*3)==20 && (k+j+i)==20){
							System.out.println(k+":childrens "+j+":ladies "+i+":Gents ");
					}
				}
			}
		}
	}
}
