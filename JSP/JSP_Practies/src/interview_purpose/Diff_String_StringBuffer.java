package interview_purpose;

public class Diff_String_StringBuffer {

	public static void main(String[] args) {
		
		String s1 = new String("naga");
		s1.concat("raju");
		System.out.println(s1);

		StringBuffer sb = new StringBuffer("naga");
		sb.append("raju");
		System.out.println(sb);
	}
}
