package basics.prgrams;

public class ObjectCloning implements Cloneable {
	int i;
	String name;

	public ObjectCloning(int i,String name) {
		this.i=i;
		this.name=name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	void value(){
		System.out.println(i+" "+name);
	}
	public static void main(String[] args) {
		ObjectCloning obj=new ObjectCloning(1,"dyj");
		ObjectCloning obj1;
		try {
			obj1 = (ObjectCloning) obj.clone();
			obj.value();
			obj1.value();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
