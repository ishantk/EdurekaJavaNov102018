package co.edureka.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//HashSet set1 = new HashSet();
		//Set<String> set1 = new HashSet<String>();
		
		//HashSet<String> set1 = new HashSet<String>();
		TreeSet<String> set1 = new TreeSet<String>();
		// Data in HashSet is stored using hashing technique (follow google if unclear on algo : hashing)
		set1.add("John");
		set1.add("Jennie");
		set1.add("John");
		set1.add("Harry");
		set1.add("John");
		set1.add("Fionna");
		set1.add("Sia");
		set1.add("Kim");
		set1.add("Harry");
		
		System.out.println(set1);
		
		// We cannot iterate using a loop as we dont have data saved on indexes. 
		// We cannot even fetch a single element using get method like ArrayList
		
		Iterator<String> itr = set1.iterator();
		while(itr.hasNext()){
			String s = itr.next();
			System.out.println(s);
		}
		
		set1.remove("John");
		System.out.println(set1);
		
		if(set1.contains("Sia")){
			System.out.println("Sia is in the Set");
		}
		
		System.out.println("set1 size is: "+set1.size());
		
		//set1.clear(); 		// Remove All
		//set1.addAll(set2);
	}

}
