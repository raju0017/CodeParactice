
package interview.company.technofort;
public class A 
{
	public String f1()
	{
		return "A::f1";
	}
	public String f2()
	{
		return "A::f2";
	}


}
class BB extends A
{
	public String f1()
	{
		return "B::f1";
	}
	public String f3()
	{
		return "B::f3";
	}

}
class CC extends B
{
	public String f1()
	{
		return "B::f1";
	}
	public String f3()
	{
		return "B::f3";
	}
}

