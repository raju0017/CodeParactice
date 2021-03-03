package interview.company.indiaBix;

public class Foo {
	Foo() 
    {
        System.out.print("foo");
    }
    
class Bar
{
    Bar() 
    {
        System.out.print("\tbar");
    }
    public void go() 
    {
        System.out.print("\thi");
    }
} /* class Bar ends */

    public static void main (String [] args) 
    {
        Foo f = new Foo();
        f.makeBar();
    }
    void makeBar() 
    {
        (new Bar() {}).go();
    }

}
