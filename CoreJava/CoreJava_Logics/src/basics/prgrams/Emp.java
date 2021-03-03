package basics.prgrams;

class Emp {
String name;
int id;
Emp(String n,int i)
{
	name=n;
	id=i;
}
@Override
public String toString()
{
	return name+","+id;
}
}
