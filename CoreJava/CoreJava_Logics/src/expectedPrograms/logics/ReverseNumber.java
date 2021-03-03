package expectedPrograms.logics;
public class ReverseNumber {
	public static void main(String[] args) {
		int i = reversrNum(678);
		System.out.println(i);
	}
	public static int reversrNum(int num)
	{
		String stringnum = String.valueOf(num);
		String reverse = "";
		for(int i=stringnum.length()-1; i>=0; i--)
		{
			reverse = reverse+stringnum.charAt(i);
		}
		int revnum = Integer.valueOf(reverse);
		return revnum;
	}
}
