package expectedPrograms.stringHandling;

public class StringRev {
	
	public static String stringRev(String s) {
		
		if (s == null)
			return null;
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(stringRev("abcd"));
	}
}