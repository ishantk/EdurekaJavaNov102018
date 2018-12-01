package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	
	int roll;
	String name;
	int height;
	
	Student(){
		
	}
	
	Student(int roll, String name, int height){
		this.roll = roll;
		this.name = name;
		this.height = height;
	}
	
	public String toString() {
		return roll+"\t"+name+"\t"+height;
	}
	
}

class StudentSorting implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		//return s1.roll - s2.roll;
		//return s1.height - s2.height;
		return s1.name.compareTo(s2.name);
	}
	
}

public class SortingList {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"John",5);
		Student s2 = new Student(111,"Jennie",6);
		Student s3 = new Student(123,"Sia",4);
		Student s4 = new Student(97,"Fionna",7);
		Student s5 = new Student(5,"Kim",5);
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Jennie");
		names.add("Sia");
		names.add("Fionna");
		names.add("Kim");
		
		Collections.sort(names);
		System.out.println(names);
		
		// What if we wish to sort students list
		StudentSorting ss = new StudentSorting();
		Collections.sort(students, ss);
		
		for(Student s : students){
			System.out.println(s);
		}

	}

}
