package basics.prgrams;

public class Builder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("ab");
		System.out.println(sb);
		sb.insert(1, "b");
		System.out.println(sb);
		System.out.println(sb.append("cbb"));
	}

}
