package interview.company.bbss;

public class MultiMain {
	
	public static void main(String...strings )
	  {
	    main(1);
	    main('a');
	  }
	  public static void main(int i)
	  {
	    System.out.println("Integer main");
	  }
	  public static void main(char a)
	  {
	    System.out.println("Char main");
	  }
}
