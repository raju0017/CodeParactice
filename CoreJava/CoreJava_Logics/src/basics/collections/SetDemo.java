package basics.collections;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		
		System.out.println("==============LeinkedHashSet Test =================");
		linkedHashSetTest();
		System.out.println("==============HashSet Test================");
		hashSetTest();
		System.out.println("==============TreeSet Test================");
		treeSetTest();
		
	}
	
	public static void hashSetTest(){
		// HashSet is not ordered , means we can't predict the order 
		Set<String> hashSet=new HashSet<>();
		hashSet.add("java");
		hashSet.add("c");
		hashSet.add("sql");
		hashSet.add("c++");
		hashSet.add("android");
		/*for(Object i:s){
			System.out.println(i);
	
		}*/
		System.out.println(hashSet);// it will print actual values,b/c Wrapper classes of primitive types
								//will overrides toString() method.
								// but if you print User Defined types it will print reference address for the Object

		
	}
	public static void linkedHashSetTest(){
		Set<String> s=new LinkedHashSet<>();
		// LinkedList is preserve the order, means insertion order it maintains
		s.add("java");
		s.add("c");
		s.add("sql");
		s.add("c++");
		s.add("android");
		s.add("java"); // it will ignore b/c Set implemented classes are unique, since duplicate elements not allowed
		/*for(Object i:s){
			System.out.println(i);
		}*/
		System.out.println(s);
	}
	
	public static void treeSetTest(){
		// TreeSet is Ordered, means by default it will sort the elements in ascending order
		Set<String> treeSet=new TreeSet<>();
		treeSet.add("java");
		treeSet.add("c");
		treeSet.add("sql");
		treeSet.add("c++");
		treeSet.add("android");
		/*for(Object i:s){
			System.out.println(i);
	
		}*/
		System.out.println(treeSet);// it will print actual values,b/c Wrapper classes of primitive types
								//will overrides toString() method.
								// but if you print User Defined types it will print reference address for the Object

		
	}
}
