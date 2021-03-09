package setter_di;

import java.util.*;

public class Student {
	// Primitive data type injection
	private String name;
	private int age;
	private String email;
	
	// Secondary data type injection
	private Address address;
	
	// Collection type List
	List<String> subjects = new ArrayList<>();
	
	// Collection type Map
	Map<String, Integer> marks = new HashMap<>();
	
	// Collection type as Object list
	List<Address> addr = new ArrayList<>();
	
	
	// Collection type as Object list
	Map<Integer, Teacher> teacher = new HashMap<>();
	
	// Array Type setter injection
	String[] classes;
	
	// Array Type setter injection
	Object[] obj;
	
	// child collection type injection
	Vector<String> vector ;
	
	
	// child type map
	Hashtable<String, String> countryCaptal;
	
	public Hashtable<String, String> getCountryCaptal() {
		return countryCaptal;
	}

	public void setCountryCaptal(Hashtable<String, String> countryCaptal) {
		this.countryCaptal = countryCaptal;
	}

	public Vector<String> getVector() {
		return vector;
	}

	public void setVector(Vector<String> vector) {
		this.vector = vector;
	}

	// properties setter injection
	ConnectionPool cp ;
	

	public ConnectionPool getCp() {
		return cp;
	}

	public void setCp(ConnectionPool cp) {
		this.cp = cp;
	}

	public Object[] getObj() {
		return obj;
	}

	public void setObj(Object[] obj) {
		this.obj = obj;
	}

	public String[] getClasses() {
		return classes;
	}

	public void setClasses(String[] classes) {
		this.classes = classes;
	}

	public Map<Integer, Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(Map<Integer, Teacher> teacher) {
		this.teacher = teacher;
	}

	public List<Address> getAddr() {
		return addr;
	}

	public void setAddr(List<Address> addr) {
		this.addr = addr;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	// Default Constructor is mandatory for  instantiate the Object if not there we will get below runtime Exception

	/*	
	 * Exception in thread "main" org.springframework.beans.factory.BeanCreationException: 
	 * Error creating bean with name 'student' defined in class path resource [a_primitive_setter_DI/spring.xml]: 
	 * Instantiation of bean failed; nested exception is org.springframework.beans.BeanInstantiationException: 
	 * Failed to instantiate [a_primitive_setter_DI.Student]: 
	 * No default constructor found; nested exception is java.lang.NoSuchMethodException: 
	 * a_primitive_setter_DI.Student.<init>()
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	// this is using for constructor injection
	public Student(String name, int age, String email, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	public void printData() {
		System.out.println("name= " + name);
		System.out.println("age= " + age);
		System.out.println("email= " + email);
		//System.out.println(address);
	}

}
