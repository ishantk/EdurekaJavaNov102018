
public class Arrays {

	public static void main(String[] args) {
		
		// Single Value Container -> Primitives
		int a1 = 10;
		// a1 is a variable which holds value 
		
		// Multi Value Container -> References
		
		// IMPLICIT SYNTAX
		int[] a2 = {10, 20, 30, 40, 50}; // Homogenous and type is int for all the elements
		// a2 is a reference variable which holds hashCode of array created in Heap -> Heap is a Data Structure where we store data and we have hashing algo
		
		// Explore hashing Algorithm in case you wanna deep dive !!
		
		// EXPLICIT SYNTAX
		int[] a3 = new int[]{10, 20, 30, 40, 50};
		// new creates array in heap area at run time i.e. when program is executed
		
		System.out.println("a1 is: "+a1);
		
		System.out.println("a2 is: "+a2);
		System.out.println("a2 length is: "+a2.length);
		
		System.out.println("a3 is: "+a3);
		System.out.println("a3 length is: "+a3.length);
		
		System.out.println("a2 hashCode is: "+a2.hashCode());
		System.out.println("a3 hashCode is: "+a3.hashCode());

		// Bracket before or After -> No Problem
		int a4[] = {10, 20, 30, 40, 50};
		int a5[] = new int[]{10, 20, 30, 40, 50};
		
		// This is an array creation for 5 elements where all the elements are 0
		// Default value for an integer is 0
		int[] a6 = new int[5];
		System.out.println("a6 is: "+a6);
		System.out.println("a6 length is: "+a6.length);
		
		// Write/Update Operation in Array
		a2[2] = 175; // Update
		
		a6[1] = 100; // Update
		a6[3] = 125;
		
		// Read Operation in Array
		System.out.println("a2[2] is: "+a2[2]);
		
		System.out.println("a6[1] is: "+a6[1]);
		System.out.println("a6[3] is: "+a6[3]);
		
		// Read All Operation in Array
		// 1. For Loop
		System.out.println("===Elements in a2===");
		for(int i=0;i<a2.length;i++){
			System.out.print(a2[i]+" ");
		}
		System.out.println();
		System.out.println("===Elements in a6===");
		for(int i=0;i<a6.length;i++){
			System.out.print(a6[i]+" ");
		}
		System.out.println();
		System.out.println("===Elements in a2 with Enhaced For===");
		// 2. Enhanced For Loop (for-each loop) : As of now can be used only to read the arrays
		// Automatically from 0 index loop will begin, copy the data in num and keep on incrementing !!
		for(int num : a2){
			System.out.print(num+" ");
		}
		System.out.println();
		
		// Reference Copy
		int[] a7 = a6;
		
		System.out.println("a7 is: "+a7);
		System.out.println("a7 length is: "+a7.length);
		
		a7[0] = 123;
		a7[1] = 156;
		
		for(int n : a6){
			System.out.print(n+" ");
		}
		System.out.println();
		
		//a6 = null; // a6 is now having no hashCode and hence Garbage Collector shall delete it form memory
		
		// PS: 1. Arrays are Homogeneous
		//     2. We cannot change Size of Array during run time i.e. when program is in execution. Its Fixed !!
		
		
		char[] chArr = {'H','E','L','L','O'};
		double[] nArr = {2.2, 3.3, 4.5, 6.6, 7.7};
		
		int[] arr = new int[100]; // here only we got 100 elements in the memory with all elements having value as 0.
		arr[0] = 100; // we dont have the size as 1, we have size as 100
		System.out.println("arr length is: "+arr.length);
		
		// 1st Index:
		System.out.println("arr[0] is: "+arr[0]);
		// Last Index:
		System.out.println("arr[99] is: "+arr[99]);
		
		// Access an Index which is not existing: -> You get an Error at Run Time i.e. Exception
		System.out.println("arr[111] is: "+arr[111]);
	}

}
