package interview.company.i_Admin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		
		String dateInString = "12022017";
		
		SimpleDateFormat formatter	= new SimpleDateFormat("ddMMyyy");
		Date date = formatter.parse(dateInString);
		
		System.out.println("Date is : "+date);
		
		System.out.println("entered String is : "+formatter.format(date));
	}
}
