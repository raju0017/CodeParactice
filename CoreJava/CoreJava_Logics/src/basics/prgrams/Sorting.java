package basics.prgrams;

public class Sorting {
	public static void main(String[] args) {
		String s1="mohan siva";
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++){
			for(int j=0;j<ch.length;j++){
				if(ch[i]<ch[j]){
					char tem=ch[i];
					ch[i]=ch[j];
					ch[j]=tem;
				}
			}
		}for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
		
	}
}
