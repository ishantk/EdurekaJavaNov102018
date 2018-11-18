class Product{

	// Property of Object
	int pid;
	String name;
	int price;
	String brand;
	
	// Property of Class
	static String appName;
	
	// Constructor is executed automatically when object is created -> in heap
	Product(){
		System.out.println(">> Product Object Constructed");
		pid = 0;
		name = "NA";
		price = 1000;
		brand = "NA";
	}
	
	void setProductDetails(int pid, String name, int price, String brand){
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.brand = brand;
	}
	
	void showProduct(){ 								// void showProduct() -> signature
		System.out.println("======"+name+"=====");
		System.out.println("PID: "+pid);
		System.out.println("Price: \u20b9"+price);
		System.out.println("Brand: "+brand);
		System.out.println("===================");
	}
	
	static void setAppName(String appName){
		Product.appName = appName;
	}
	
	static void showAppName(){
		System.out.println("***"+Product.appName+"***");
	}
	
}

// Inheritance : MobilePhone IS-A Product (Generalization)
// We want to re use parent's code -> Save our time
class MobilePhone extends Product{
	
	// Attributes : Additional Attributes for Mobile Phone Object
	int ram;
	String os;
	
	MobilePhone() {
		System.out.println(">> MobilePhone Object Constructed");
	}

	// We customized methods from parent into child
	// 1. Overloading -> can happen in the same class or parent child relationship
	// 2. Overriding  -> cannot happen in the same class -> must have parent child relationship
	
	
	// Creating a new method with same name and different inputs: Method Overloading
	void setProductDetails(int pid, String name, int price, String brand, int ram, String os){
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.ram = ram;
		this.os = os;
	}
	
	// Creating a new method with same name and same inputs: Method Overriding -> Happens only in case of Parent Child Relationship
	void showProduct(){  				// void showProduct() -> signature
		System.out.println("======"+name+"=====");
		System.out.println("PID: "+pid);
		System.out.println("Price: \u20b9"+price);
		System.out.println("Brand: "+brand);
		System.out.println("RAM: "+ram);
		System.out.println("OS: "+os);
		System.out.println("===================");
	}
}


public class InheritanceApp {

	public static void main(String[] args) {

		/*Product pRef = new Product();
		pRef.setProductDetails(1001, "iPhoneX", 70000, "Apple");
		pRef.showProduct();*/
		
		// When we create Object of MobilePhone
		// Rule: Before child object is constructed, parent object is constructed in the memory first
		// Constructors are not INHERITED and private is not INHERITED, rest everything from parent will be inherited into the child
		MobilePhone mRef = new MobilePhone();
		//mRef.setProductDetails(1001, "iPhoneX", 70000, "Apple");
		mRef.setProductDetails(1001, "iPhoneX", 70000, "Apple",4,"iOS");
		mRef.showProduct(); // Child's version will be executed over the Parent's Version
		
		// Class to Class Inheritance
		MobilePhone.appName = "Amazon";
		MobilePhone.showAppName();
		
	}

}
