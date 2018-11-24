interface Inf1{
	
	int a = 10;		 // public static final int a = 10;
	
	void show();	 // public abstract void show();
	void fun();		 // public abstract void fun();
}

interface Inf2{
	void hello();
	void fun();
}

// Object to Object Inheritance > non static
// Class to Class Inheritance 	>  static
// Interface to Interface	 	>  static(in terms of interface)

interface Inf3 extends Inf1, Inf2{ // Multiple Inheritance in Java -> Supported by Interfaces | Interface to Interface Inheritance
	
}

//class InfImpl implements Inf1{ // Implementing single interface 
class InfImpl implements Inf3{ //Inf1, Inf2{  // implementing multiple interfaces
	
	public void show(){
		System.out.println("This is show !!");
	}
	
	public void fun(){
		System.out.println("This is fun");
	}
	
	public void hello(){
		System.out.println("This is hello");
	}
	
	// bye is a method of InfImpl Object not re-defined as some rule
	void bye(){
		System.out.println("This is bye");
	}
}

public class InterfacesDemo {

	public static void main(String[] args) {
		
		System.out.println("a is: "+Inf1.a);
		
		InfImpl iRef = new InfImpl(); // Direct Object Construction of InfImpl
		iRef.show();
		iRef.fun();
		System.out.println("a is: "+InfImpl.a);

		System.out.println();
		
		
		Inf1 i1 = new InfImpl();    // Polymorphic Statement : Ref Var of Interface points to the object which implements it
		i1.show();
		i1.fun();
		//i1.hello(); // error -> hello is in Inf2
		
		System.out.println();
		
		Inf2 i2 = new InfImpl();
		i2.hello();
		i2.fun();
		//System.out.println("a is: "+Inf2.a); // error
		
		System.out.println();
		
		Inf3 i3 = new InfImpl(); // Polymorphic Statement | Ref Var of Interface is pointing to the object which implements it
		i3.fun();
		i3.show();
		i3.hello();
		System.out.println("a is: "+Inf3.a);
		
		System.out.println();
		
		InfImpl i = new InfImpl();  // Direct Object Construction of InfImpl
		Inf3 j = i;					// Polymorphic Statement | Up-Casting
		
		InfImpl k = (InfImpl)j; 	// Down-Casting
		
	}

}
