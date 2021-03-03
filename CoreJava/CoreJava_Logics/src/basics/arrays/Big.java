package basics.arrays;
public class Big {

	public static void main(String[] args) {
		int [] arr={10,15,20,70,56};
		int big=0;
		for(int element :arr)
		{
			if(element>big) big=element;
		}
		System.out.println("Big element is "+big);
	}

}
