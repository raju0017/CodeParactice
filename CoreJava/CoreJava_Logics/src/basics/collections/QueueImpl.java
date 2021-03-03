package basics.collections;

import java.util.ArrayList;
public class QueueImpl {

	private ArrayList a=new ArrayList();
	public void add(Object ele){
		a.add(ele);
	}
	public int size(){
		return a.size();
		
	}
	public Object peek(){
		if(a.size()>=1) return a.get(0);
		else return null;
	}
	public Object poll() throws NullvalueException
	{
		if(a.size()==0){
			 throw new  NullvalueException();
			 
		}
		Object obj =a.get(0);
		 a.remove(0);
		return obj;
	}
}
class  NullvalueException extends Throwable
{
	String s="Object was not created";
	public String toString(){
		return  "NullvalueException:"+ s;
	}
}

