package interview.company.paladian;

public class SumofNumerics {
	public static long getSum(String str) {
		char[] ch = str.toCharArray();
		long total = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '9') {
				total += Long.parseLong("" + ch[i]);
			}
		}
		return total;
	}
	
	public static void main(String[] args) {
		long l = getSum("naga1234");
		System.out.println(l);
	}
}
