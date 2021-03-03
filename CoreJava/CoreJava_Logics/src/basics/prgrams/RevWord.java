package basics.prgrams;

public class RevWord {

	public static void main(String[] args) {
			String s1="java is very easy";
			String[] s2=s1.split(" ");
			for(String s:s2){
				System.out.println(s);
			}
			StringBuilder sb=new StringBuilder();

			for(int i=s2.length-1; i>=0; i--){
				sb.append(s2[i]);
				sb.append(" ");
			}
			String s3=sb.toString().trim();
			System.out.println(s3);
					
		}
	}


