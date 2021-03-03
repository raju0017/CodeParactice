package basics.prgrams;
public class SetterAndGetter {
	private String name;
	public void SetName(String s){
		name=s;
	}
	public String getName(){
		return name;
	}
	public static void main(String[] args) {
		SetterAndGetter s=new SetterAndGetter();
		s.SetName("king");
		String s1=s.getName();
		System.out.println(s1);
	}

}
