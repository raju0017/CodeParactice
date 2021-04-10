package basics.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemo {
	// if we add duplicate key in map it will replace the old value with new value for that key

	public static void main(String[] args) {
		
		System.out.println("==============hashMap Test =================");
		hashMapTest();
		System.out.println("==============LinkedHashMap Test =================");
		linkedHashMapTeat();
		System.out.println("==============TreeMap =================");
		treeMapTest();
		System.out.println("==============hashtable =================");
		hashtableTest();


	}

	public static void hashMapTest() {
		// HashMap is not ordered, means we can't predict the order
		// we can insert one null key and multiple null values in HashMa
		
		Map<Character, Integer> hashMap = new HashMap<>();

		hashMap.put('x', 24);
		hashMap.put('a', 1);
		hashMap.put('a', 2); // it will replace 1 with 2
		hashMap.put('a', 3);// it will replace 2 with 3
		hashMap.put('b', 2);
		hashMap.put('z', 26);
		// we can insert one null key and multiple null values in HashMa
		hashMap.put(null, null);
		hashMap.put(null, 123);// here it will replace null value with 123
		hashMap.put('c', null);
		hashMap.put('d', null);
		
		System.out.println(hashMap);
	}
	
	public static void linkedHashMapTeat() {
		// LinkedHashMap is preserve the order, means insertion order it maintains 
		// we can insert one null key and multiple null values in HashMa
		Map<Character, Integer> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put('x', 24);
		linkedHashMap.put('a', 1);
		linkedHashMap.put('a', 2); // it will replace 1 with 2
		linkedHashMap.put('a', 3);// it will replace 2 with 3
		linkedHashMap.put('b', 2);
		linkedHashMap.put('z', 26);
		
		// we can insert one null key and multiple null values in LinkedHashMa
		linkedHashMap.put(null, null); // here it will replace null value with 123
		linkedHashMap.put(null, 123);// 
		linkedHashMap.put('c', null);
		linkedHashMap.put('d', null);
		System.out.println(linkedHashMap);
		
	}
	
	public static void treeMapTest(){
		// TreeMap is Ordered, means by default it will sort the elements in ascending order
		Map<Character, Integer> treeMap = new TreeMap<>();

		treeMap.put('x', 24);
		treeMap.put('a', 1);
		treeMap.put('a', 2); // it will replace 1 with 2
		treeMap.put('a', 3);// it will replace 2 with 3
		treeMap.put('b', 2);
		treeMap.put('z', 26);
		System.out.println(treeMap);
	}
	
	public static void hashtableTest(){
		// Hastable is not Ordered it is not maintains any order
		Map<Character, Integer> hashtable = new Hashtable<>();

		hashtable.put('x', 24);
		hashtable.put('a', 1);
		hashtable.put('a', 2); // it will replace 1 with 2
		hashtable.put('a', 3);// it will replace 2 with 3
		hashtable.put('b', 2);
		hashtable.put('z', 26);
		System.out.println(hashtable);

	}
	
	public static void removeDuplicatesInMap(){
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(15,"five");
        map.put(25,"five");
        map.put(35,"five");
        map.put(22,"two");
        map.put(32,"two");
        map.put(42,"two");
        
        System.out.println("Before removing duplicate values from map");
        System.out.println(map);
        
        Set<String> valueSet=new TreeSet<String>(map.values());
        System.out.println("Set of unique values");
        System.out.println(valueSet);
        
        Iterator<String> iterator=valueSet.iterator();
        Map<Integer,String> uniqueMap=new HashMap<Integer,String>();
        while (iterator.hasNext()) {
            String value = iterator.next();
            for(Map.Entry<Integer,String> e:map.entrySet())
            {
                if(value.equals(e.getValue()) && !uniqueMap.containsValue(value))
                {
                    uniqueMap.put(e.getKey(), value);
                }

            }

        }
        System.out.println("After removing duplicate values from map");
        System.out.println(uniqueMap);
	}

}
