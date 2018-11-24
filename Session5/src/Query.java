class Parent{
	
	int vehicles;
	
	void show(){
		System.out.println("This is show of Parent");
	}
}

class Child extends Parent{
	
	String companyName;
	
	void fun(){
		System.out.println("This is fun");
	}
}

class A{
	A(){
		System.out.println(">> A Constructed");
	}
	
	A(int x){
		System.out.println(">> A Constructed and x is: "+x);
	}
}

class B extends A{
	B(){
		//super() as a call should be used in constructors and should be the first statement
		//super(10); // choose how the parent object should be constructed i.e. with which constructor
		//super(); // super -> making parent's default constructor to be executed
		System.out.println(">> B Constructed");
	}
}

public class Query {

	public static void main(String[] args) {
		
		B bRef = new B(); // whats the output?
		// Rule of Inheritance says: Parent object is constructed before child object
		
		/*Child ch = new Child();
		ch.vehicles = 2;
		ch.companyName = "Edureka";
		ch.show();
		ch.fun();*/
		
	}

}
