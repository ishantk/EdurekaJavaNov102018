/*class Cab{
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	void bookCab(){
		System.out.println(">> Cab Booked !! Arriving Soon !!");
	}
}*/

// Refining our RTP Model
// we are limiting user to get the objects constructed for Cab class now.
// Cab class cannot be instantiated by user, we cannot create its objects
// BUT as per Inheritance principle, Parent Object Construction happens before Child Object Construction (JVM)
/*abstract class Cab{
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	// abstract method is a rule or a protocol
	// has no definition and is only defined in an abstract class
	// has to be defined by the child at any cost. if we have n number of abstract methods in Parent, we must define them all in child
	abstract void bookCab();
	
	void fun(){
		System.out.println("This is fun - a normal method");
	}
}*/

// Refining RTP model to Best !! Lets use Interfaces !!
// Interface is a Rule Book, which object can implement and define the rules !!
interface Cab{
	
	// interfaces cannot have constructors -> neither we not JVM can create objects for interfaces.
	/*Cab(){
		System.out.println(">> Cab Object Constructed");
	}*/
	
	// abstract method is a rule or a protocol
	// has no definition
	// has to be defined by the child at any cost. if we have n number of abstract methods in Parent, we must define them all in child
	void bookCab(); // public abstract void bookCab();
	
	/*void fun(){
		System.out.println("This is fun - a normal method");
	}*/ // not allowed
}

// Abstract Class Vs Interface
// AC is the Parent	!! 					eg: breakfastAt8AM() -> Rule by Parent				extends
// Interface is not the Parent !!		eg: wearHelmet() 	 -> Not a Rule by Parent		implements

class UberGo implements Cab{// extends Cab{
	
	UberGo(){
		System.out.println(">> UberGo Object Constructed");
	}
	
	// Re-Defined the same method in child : Overriding
	public void bookCab(){
		//super.bookCab(); 	// bookCab method of Parent Object
		System.out.println(">> UberGo Cab Booked !! Arriving Soon !!");
	}
	
}

class UberX implements Cab{//extends Cab{
	
	UberX(){
		System.out.println(">> UberX Object Constructed");
	}
	
	// Re-Defined the same method in child : Overriding
	public void bookCab(){
		System.out.println(">> UberX Cab Booked !! Arriving Soon !!");
	}
	
}

class UberMoto implements Cab{//extends Cab{
	
	UberMoto(){
		System.out.println(">> UberMoto Object Constructed");
	}
	
	// Re-Defined the same method in child : Overriding
	public void bookCab(){
		System.out.println(">> UberMoto Cab Booked !! Arriving Soon !!");
	}
	
}

public class RTP {

	public static void main(String[] args) {
	
		/*Cab c;
		c = new Cab(); 				// Object Construction Statement : Direct object construction
		c.bookCab();*/
		
		//UberGo u = new UberGo();	// Object Construction Statement : Parent Object shall be constructed and then the child object
		//u.bookCab();
		
		// Polymorphic Statement : Reference Variable of Parent can point to object of child
		// Polymorphic Statement : Reference Variable of Interface can point to object which implements it
		Cab c; 				// Ref Var of Parent
		c = new UberGo(); 	// Pointing to the object of Child
		c.bookCab();        // We are executing bookCab method on Parent, but Child's definition will be executed because of overriding

		// RTP is deciding which definition will be executed, i.e. bookCab of parent or child. This decision to execute 
		// the defnition of child is taken at run time.
		
		System.out.println();
	
		c = new UberX(); 
		c.bookCab();
	
		System.out.println();
		
		c = new UberMoto(); 
		c.bookCab();
	
		// RTP in actual over here is the same bookCab method books different types of cabs
		
		System.out.println();
		
		// A user can execute below such statements:
		// They are meaningless for us now. execution of bookCab on Cab object is no longer required
		/*c = new Cab();
		c.bookCab();*/  // >> Cab booked !! Arriving Soon !! -> No Sense
		
	}

}
