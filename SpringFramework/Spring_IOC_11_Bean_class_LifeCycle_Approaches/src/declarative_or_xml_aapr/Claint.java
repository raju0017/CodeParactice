package declarative_or_xml_aapr;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import declarative_or_xml_aapr.Test;

public class Claint {

	public static void main(String[] args) throws Exception
	{
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("declarative_or_xml_aapr/spring.xml");
		int i;
		do
		{
			Scanner scn = new Scanner(System.in);
			System.out.println("enter 1 for save 2 for close");
			i = scn.nextInt();
			switch (i) {
			case 1:
				Test t = (Test) cap.getBean("t");
				System.out.println("enter id");
				int id = scn.nextInt();
				System.out.println("enter name");
				String name = scn.next();
				System.out.println("enter email");
				String email = scn.next();
				System.out.println("enter marks");
				int marks = scn.nextInt();
				t.save(id, name, email, marks);	
				break;
			case 2:
				cap.close();
				break;
			default:
				cap.close();
				break;
			}
		}
		while(i==1);
		
		
	}

}
