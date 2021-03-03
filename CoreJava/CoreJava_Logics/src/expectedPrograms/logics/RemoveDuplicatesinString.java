package expectedPrograms.logics;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesinString {

	public static void main(String[] args) {
		String str = "nagaraju";
		String str1 = removeDuplicates(str);
		System.out.println(str1);
	}
	public static String removeDuplicates(String str) {
		Set<Character> set = new HashSet<Character>();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
