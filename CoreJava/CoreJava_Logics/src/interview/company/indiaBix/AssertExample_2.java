package interview.company.indiaBix;

public class AssertExample_2 {
	public void foo() 
    {
        assert false; /* Line 5 */
        assert false; /* Line 6 */
    } 
    public void bar()
    {
        while(true)
        {
            assert false; /* Line 12 */
            //break;
        } 
       // assert false;  /* Line 14 */  hewrw is  compilation error
    } 
}
