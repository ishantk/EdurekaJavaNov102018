package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Employee{
	int eid;
	String name;
}

public class ListDemo {

	public static void main(String[] args) {
		
		// Construction of list in memory (Heap)
		
		// list1 can store any Object | Raw Type
		ArrayList list1 = new ArrayList();  // Direct Object
		//List list1 = new ArrayList();		// Polymorphic Statement

		// list2 can store only String Objects
		ArrayList<String> list2 = new ArrayList<String>();
		
		// list3 can store only Employee Objects
		ArrayList<Employee> list3 = new ArrayList<Employee>();
		
		// 1. Add Data in ArrayList
		
		// list1 can store any type of data
		list1.add("John"); 		//list1.add(0,"John");
		list1.add("Jennie");	//list1.add(1,"Jennie");
		list1.add(100); 		//list1.add(2, new Integer(100)); // AutoBoxing
		list1.add(2.2);
		list1.add('A');
		list1.add(true);
		
		Employee e1 = new Employee();
		e1.eid = 101;
		e1.name = "George";
		
		Employee e2 = new Employee();
		e2.eid = 201;
		e2.name = "Fionna";
		
		list1.add(e1);
		
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("John");
		list2.add("Jack");
		list2.add("John");
		list2.add("Joe");
		//list2.add(100);  // err
		//list2.add(e1);   // err
		
		list3.add(e1);
		list3.add(e2);
		//list3.add("Sia"); //err
		
		// 2. Get Data from ArrayList
		//    Fetching only single element based on the index (get method)
		
		String str = (String)list1.get(0);
		int num = (int)list1.get(2);			// AutUnBoxing
		
		System.out.println("str: "+str);
		System.out.println("num: "+num);
		
		// Object is parent to every class in java.
		// Ref Var of Obejct can point to any object in java
		Object oRef = list1.get(0);
		
		System.out.println("oRef: "+oRef);
		
		oRef = list1.get(3);
		
		System.out.println("oRef: "+oRef);
		
		String name = list2.get(3);
		System.out.println("name is "+name);
		
		Employee emp = list3.get(1);
		System.out.println(emp.eid+" - "+emp.name);
		
		// Size of list
		int l1 = list1.size();
		int l2 = list2.size();
		int l3 = list3.size();
		
		System.out.println("l1: "+l1);
		System.out.println("l2: "+l2);
		System.out.println("l3: "+l3);
		
		System.out.println();
		
		// Fetch All Elements from List
		// 1. for loop
		System.out.println("=====1. For Loop====");
		for(int i=0; i<list1.size(); i++){
			Object o = list1.get(i);
			System.out.println(o);
		}
		
		System.out.println();
		
		for(int i=0;i<list2.size();i++){
			String s = list2.get(i);
			System.out.println(s);
		}
		
		System.out.println();
		
		for(int i=0;i<list3.size();i++){
			Employee e = list3.get(i);
			System.out.println(e.eid+"\t"+e.name);
		}
	
		// 2. Enhanced For Loop
		System.out.println("=====2. Enhanced For Loop====");
	
		for(Object o : list1){
			System.out.println(o);
		}
		
		System.out.println();
		
		for(String s : list2){
			System.out.println(s);
		}
		
		System.out.println();
		
		for(Employee e : list3){
			System.out.println(e.eid+"\t"+e.name);
		}
		
		//3. Iterator
		System.out.println("=====3. Iterator====");
		Iterator itr1 = list1.iterator();
		Object o = itr1.next();
		System.out.println(o);
		o = itr1.next();
		System.out.println(o);
		
		System.out.println();
		
		
		Iterator<String> itr2 = list2.iterator();
		while(itr2.hasNext()){
			String s = itr2.next();
			System.out.println(s);
			if(s.equals("Jennie")){
				itr2.remove(); // deleting element from the list
			}
		}
		
		Iterator<Employee> itr3 = list3.iterator();
		//...
		
		System.out.println("=====4. ListIterator====");
		ListIterator<String> listItr2 = list2.listIterator();
		
		while(listItr2.hasNext()){
			String s = listItr2.next();
			System.out.println(s);
		}
		
		System.out.println("---");
		while(listItr2.hasPrevious()){
			String s = listItr2.previous();
			System.out.println(s);
		}
		
		System.out.println("=====5. Enumeration===="); // | Works like iterator but cannot remove elements 
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String s = enm.nextElement();
			System.out.println(s);
		}
	
		System.out.println();
		
		// Printing Reference Variables : We get HashCodes. If we do not get hashCodes, toString() method is in action
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		// Update Operation
		list2.set(2, "Sia");
		System.out.println(list2);
		
		// Delete Operation
		list2.remove(2);
		System.out.println(list2);
		
		// Merge Operation
		ArrayList<String> names = new ArrayList<>();
		names.add("Kim");
		names.add("Harry");
		names.add("Fionna");
		names.add("George");
		
		list2.addAll(names); // -> We are merging names in list2
		System.out.println(names);
		System.out.println(list2);
		
		if(list2.contains("John")){
			System.out.println("John is in the list");
		}
		
		int idx = list2.indexOf("John");
		idx = list2.lastIndexOf("John");
		System.out.println("John is available at "+idx+" index");
		
		list2.clear(); // remove all elements from list2
		System.out.println(list2);
		
		System.out.println("Is List2 Empty: "+list2.isEmpty());
		
		// THREAD-SAFE
		Vector<String> vector = new Vector<String>();
		vector.add("Kim");
		vector.add("Harry");
		vector.add("Fionna");
		vector.add("George");
		
		System.out.println("===Vector Details===");
		System.out.println(vector);
		
	}

}
