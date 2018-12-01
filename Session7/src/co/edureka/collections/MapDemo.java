package co.edureka.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		//Map<Integer, String> map = new HashMap<Integer, String>(); 		// Polymorphic
		HashMap<Integer, String> map = new HashMap<Integer, String>();		// Direct Object Construction
		map.put(101, "Sia");
		map.put(119, "John");
		map.put(345, "Jennie");
		map.put(643, "Sia");
		map.put(123, "Fionna");
		map.put(null, "Harry");
		map.put(411, null);
		
		// Output is unordered : Hashing !!
		System.out.println("===Map Contents===");
		System.out.println(map);
		
		String name = map.get(123);
		System.out.println("Name is: "+name);
		
		map.put(123,"Riya"); // Keys cannot be duplicated. They are unique.
		// reusing the same key will modify the content !!
		
		System.out.println(map);
		
		System.out.println(map.size());
		//map.clear();
		
		if(map.containsKey(119)){
			System.out.println("119 exists");
		}
		
		if(map.containsValue("Harry")){
			System.out.println("Harry Exists");
		}
		
		Set<Integer> keys = map.keySet();
		System.out.println("===Keys in Map===");
		System.out.println(keys);
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(key+"\t"+value);
		}
		
		System.out.println("==EntrySet==");
		
		// Iterating using Entry
		Set<Entry<Integer, String>> set = map.entrySet();
		Iterator<Entry<Integer, String>> itr1 = set.iterator();
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		
		// THREAD-SAFE i.e. Synchronized
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();		// Direct Object Construction
		table.put(101, "Sia");
		table.put(119, "John");
		table.put(345, "Jennie");
		table.put(643, "Sia");
		table.put(123, "Fionna");
		//table.put(null, "Harry"); // no null key supported
		//table.put(411, null);		// no null value supported
		
		System.out.println(table);
	}

}
