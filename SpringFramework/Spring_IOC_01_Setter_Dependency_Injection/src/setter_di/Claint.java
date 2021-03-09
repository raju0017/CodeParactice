package setter_di;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Vector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Claint {

	public static void main(String[] args) {
		
		/*Resource r = new ClassPathResource("a_primitive_setter_DI/spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(r);*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("setter_di/spring.xml");

		Student student = context.getBean("student", Student.class);
		
		System.out.println("****************Primitive Types*************");
		student.printData();
		
		System.out.println("\n****************Object Types*************");
		System.out.println(student.getAddress());
		

		System.out.println("\n****************Collection Types List*************");
		System.out.println(student.getSubjects());
		
		System.out.println("\n****************Collection Types Map*************");
		System.out.println(student.getMarks());
		
		System.out.println("\n****************Collection Types Object List*************");
		System.out.println(student.getAddr());
		
		
		System.out.println("\n****************Collection Types Object Map*************");
		Map<Integer, Teacher> teacherMap = student.getTeacher();
		
		for(Entry<Integer, Teacher> entry : teacherMap.entrySet()){
			Teacher teacher = entry.getValue();
			System.out.println("ID = "+teacher.getId());
			System.out.println("name = "+teacher.getName());
			System.out.println("dealingSub = "+teacher.getDealingSub());
		}
		
		System.out.println("\n****************Array Types Primitive*************");
		String[] classes = student.getClasses();
		for(String cls : classes){
			System.out.println(cls);
		}
		
		
		System.out.println("\n****************Array Types Object*************");
		Object[] obj = student.getObj();
		for(Object o : obj){
			if(o instanceof Address){
				Address add = (Address)o;
				System.out.println("==========Address===========");
				System.out.println(add.getHouseNo());
				System.out.println(add.getState());
			}
			if(o instanceof Teacher){
				Teacher tea = (Teacher)o;
				System.out.println("==========Teacher===========");
				System.out.println(tea.getId());
				System.out.println(tea.getName());
			}
		}
		
		System.out.println("\n****************Chiled collection type*************");
		Vector<String> vect = student.getVector();
		System.out.println("firstElement = "+vect.firstElement());
		System.out.println("lastElement = "+vect.lastElement());

		
		System.out.println("\n****************Chiled collection type*************");
		Hashtable<String, String> ht = student.getCountryCaptal();
		Set<String> keys = ht.keySet();
		for (String key : keys) {
			System.out.println("Cuntry=" + key + "  Capital =" + ht.get(key));
		}
		
		//for properties injection we need to use schema xml in configuration xml file
		System.out.println("\n****************properties  getting normal and using expression tags*************");
		ConnectionPool cp = student.getCp();
		cp.printData();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}