// Textual Representation of an Object.
// { } -> Define Boundary of Object as container.
// Whatever we are writing in Class belongs to object and not to class
class User{
	
	// Attributes : Belongs to Object not to Class
	// We as technical people cannot say below attributes are of User Class
	// We will say attributes are of User Object
	
	// Our attributes can either go as private or non private (default)
	// Now references to the objects cannot access phone and email
	String name;
	private String phone;
	private String email;
	int age;
	char gender;
	
	// Attribute : if marked as static Belongs to class
	// static is property of class and not of object
	static String appName;
	
	// Methods : Belongs to Object not to Class
	
	// Setter Methods for our private attributes
	// We can write the data in attributes with these methods
	void setPhone(String num){
		if(num.length()<11){
			phone = "NA";
			System.out.println("Please Enter a Valid Number(Min 10 numbers)");
		}else{
			phone = num;
		}
	}
	
	void setEmail(String email){ // setEmail has a variable email which is same name as that of object's email
		if(email.contains("@") && email.contains(".")){
			this.email = email; // this.email is object's email and email is method's email
		}else{
			this.email = "NA";
			System.out.println("Please Enter a Valid Email");
		}
	}
	
	// Getter Methods for our private attributes
	// We can read the data in attributes with these methods
	String getPhone(){
		return phone;
	}
	
	String getEmail(){
		return email;
	}
	
	// static method -> belongs to class and not to object
	// it can only access static attributes. it cannot access object's attributes
	static void showAppName(){
		System.out.println("**************");
		System.out.println(User.appName);
		System.out.println("**************");
	}
}


// Object App is a class where it has a main method.
// We will code or represent User Object separately !!
public class ObjectApp {

	// We must code in main which will be executed automatically by JVM when we run our Application
	public static void main(String[] args) {
		
		// 1. Object Construction Statement
		User uRef1 = new User();
		// new creates object of type User in the Heap area at run time i.e. dynamically
		
		// Size of Object depends on the attributes size
		
		User uRef2 = new User();
		// uRef1 and uRef2 are not Objects !! They are REFERENCE VARIABLES !!
		
		User uRef3 = uRef1; // Reference Copy
		
		// ObjectApp app = new ObjectApp(); // Since we have no attribute so object as a container is empty !!
		
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		System.out.println("uRef3 is: "+uRef3);
		
		// Write Operation in Object 
		// Writing Data in object will form key value pairs -> State of an Object
		uRef1.name = "John"; // Key Value Pair | names is key and John is value
		//uRef1.phone = "+91 99999 88888";
		//uRef1.email = "john@example.com";
		uRef1.setPhone("+91 99999");
		uRef1.setEmail("john@example.com");
		uRef1.age = 30;
		uRef1.gender = 'M';
		
		uRef2.name = "Fionna";
		//uRef2.phone = "+91 88888 66666";
		//uRef2.email = "fionna@example.com";
		uRef2.setPhone("+91 88888 66666");
		uRef2.setEmail("fionna@example.com");
		uRef2.age = 32;
		uRef2.gender = 'F';
		
		// Update Operation
		uRef2.age = 33;
		uRef3.age = 32;
		uRef3.name = "John Watson";
		
		// Delete Operation will be taken care by Garbage Collector
		// If we make references to point to null its an indication to GC to remove objects from Heap !!
		// uRef3 = null; or uRef1 = null;
		
		// Read Operation
		//System.out.println(uRef1.name+" is "+uRef1.age+" years old and can be contacted at "+uRef3.phone);
		//System.out.println(uRef2.name+" is "+uRef2.age+" years old and can be contacted at "+uRef2.phone);
		
		// All the object which we will create will have same attributes but can have different value to them
		
		// Write Operation in property of class
		// we will use class name to write the data
		User.appName = "Amazon Prime";  // No Confusion
		uRef3.appName = "Amazon";		// Confusion as we might think appName is Object's Property
		
		User.showAppName();
		
		System.out.println(uRef1.name+" belongs to "+uRef1.appName+" App, is "+uRef1.age+" years old and can be contacted at "+uRef3.getPhone());
		System.out.println(uRef2.name+" belongs to "+User.appName+" App,  is "+uRef2.age+" years old and can be contacted at "+uRef2.getPhone());
		
		// RULE:
		// Property of object can only be accessed through its reference variable
		// Property of Class can be accessed by class name or any reference variable of any object

	}

}
