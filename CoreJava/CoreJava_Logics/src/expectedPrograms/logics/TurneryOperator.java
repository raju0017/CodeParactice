package expectedPrograms.logics;
public class TurneryOperator {
	public static void main(String[] args) {
		int a=10;
		int b=25;
		int c=21;
		int big=0;
		big=a>b? a>c? a:c : b>c? b:c;
		System.out.println(big);
	}

}
