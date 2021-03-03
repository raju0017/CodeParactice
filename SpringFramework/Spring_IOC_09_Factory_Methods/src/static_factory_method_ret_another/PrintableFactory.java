package static_factory_method_ret_another;

public class PrintableFactory {
	
	public static Printable getPrintable()
	{
		return new A();
	}
}
