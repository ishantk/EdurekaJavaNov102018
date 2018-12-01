package co.edureka.collections;

class Outer{
	
	void show(){
		System.out.println("This is show of Outer");
	}
	
	// Nested or Inner Class
	class Inner{
		void show(){
			System.out.println("This is show of Inner");
		}
	}
	
}

class CA{
	
}

public class NestedDemo {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		oRef.show();
		
		// Creating Object for Inner Class 
		// Containment Relation (An Object is containing another object)
		Outer.Inner iRef = oRef.new Inner();
		iRef.show();
	}

}
