
public class CalculatorApp {

	// POLYMORPHISM -> Same Method Name is used to add numbers with different inputs
	void addNumbers(int num1, int num2){
		int sum = num1+num2;
		System.out.println("Sum is: "+sum);
	}
	
	// Same Method Name with Different Inputs
	
	// Number of Inputs
	void addNumbers(int num1, int num2, int num3){
		int sum = num1+num2+num3;
		System.out.println("Sum is: "+sum);
	}
	
	// Type of Inputs
	void addNumbers(double num1, double num2){
		double sum = num1+num2;
		System.out.println("Sum is: "+sum);
	}
	
	// Sequence of Inputs
	void addNumbers(int num1, double num2){
		double sum = num1+num2;
		System.out.println("Sum is: "+sum);
	}
	
	void addNumbers(double num1, int num2){
		double sum = num1+num2;
		System.out.println("Sum is: "+sum);
	}
	
	boolean loginUser(long phone, int otp){
		
		boolean loginCheck = false;
		
		//..
		
		return loginCheck;
	}
	
	// Cannot overload on the basis of return types
	/*int loginUser(long phone, int otp){
		
		int check = 0;
		
		//..
		
		return check;
	}*/
	
	boolean loginUser(String email, String password){
		
		boolean loginCheck = false;
		
		//..
		
		return loginCheck;
	}
	
	/*
	 	Rules to Overload
	 	1. Method Name Should be Same
	 	2. Inputs should be Unique i.e. Different
	 	   2.1 Number if Inputs can increases or decrease
	 	   2.2 Type of inputs
	 	   2.3 Sequence of Inputs
	 	3. Return Type has no role to play
	 */
	
	public static void main(String[] args) {
		
		CalculatorApp app = new CalculatorApp();
		
		// Why Compile Time Polymorphism
		// During Compilation, compiler shall bind which method call has to be linked to which definition.
		
		app.addNumbers(10, 20);
		app.addNumbers(10, 20.22);
		app.addNumbers(10, 20, 30);
		app.addNumbers(10.22, 20.33);
		
		app.loginUser(9999977777l, 5678);
		app.loginUser("john@example.com", "password123");

	}

}
