package basics.prgrams;

public class Rect {
	int length;
	int breadth;
	public Rect(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	@Override
	public String toString()
	{
		return "length:"+length+",breadth:"+breadth;
		
	}
	@Override
	public boolean equals(Object arg0)
	{
		if (!(arg0 instanceof Rect)) return false;
		Rect r=(Rect) arg0;
		return length==r.length&&breadth==r.breadth;
	}
}
