package non_static_method_ret_another;

public class PrintableFactory {
	
	public Printable getPrintable()
	{
		return new A();
	}
}
