import java.util.Scanner; // Scanner is an API which helps us to read data from User on Console


public class UberApp {

	// Method or Function
	// void is acknowledgement
	// bookCab is the name of method
	// String sourceLoc, String destLoc, int typeOfCab, int paymentMode are the inputs
	// Since bookCab is a kind of procedure which will be same and user will do it repeatedly
	void bookCab(String sourceLoc, String destLoc, int typeOfCab, int paymentMode){
		
		// We are just trying to write a bit of logical part
		
		if(typeOfCab == 1){
			System.out.println("UberX is coming to pick you from "+sourceLoc);
		}else if(typeOfCab == 2){
			System.out.println("UberGo is coming to pick you from "+sourceLoc);
		}else{
			System.out.println("Please Make a choice for Type Of Cab First");
		}
		
		if(paymentMode == 1){
			System.out.println("Please Pay Cash on Ride Completion");
		}else if(paymentMode == 2){
			System.out.println("Amount will be deducted automatically from your card");
		}
	}
	
	// loginUser is a non static method. Why? Because we have not put a static keyword in the beginning.
	// If we specify any return type, we need to return at the end of function
	boolean loginUser(long phoneNumber, int otp){
		
		boolean loginCheck;
		
		// Dummy Logic Check for Login
		if(phoneNumber == 9999977777l && otp == 5678){
			loginCheck = true;
		}else{
			loginCheck = false;
		}
	
		// Since, return type is boolean we have returned any possible values for boolean
		return loginCheck; // return statement is given in the end of the method
		
		// After method has returned it clearly means no more execution -> its like exiting the function
		// int i = 10; -> Makes no sense
	}
	
	// calculateFare is a static method. Why? Because we have put a static keyword in the beginning.
	static int calculateFare(String sourceLoc, String destLoc){
		
		// Some Logical Part shall check the distance between source and destination
		
		System.out.println("===Calculating Fare from "+sourceLoc+" to "+destLoc+"===");
		
		int distance = 13; // 13 kms or miles
		int fare=0;
		if(distance<=5){
			fare = 100;
		}else if(distance >=6 && distance<=10){
			fare = 200;
		}else{
			fare = 15*distance;
		}
		
		return fare;
	}
	
	
	//1. Non Static -> Are Executed with the help of an Object
	//2. Static     -> Are Executed with the help of a Class
	
	// -> What is a method
	// -> How to execute it 
	
	// main is a method which will executed automatically when we run our app
	// this is executed firstly !!
	// Method executes statements sequentially
	public static void main(String[] args) {
		
		System.out.println("==Uber Application Started==");
		
		boolean isUserLoggedIn = false;
		int fare = 0;
		
		// To Execute a Non Static Method we will create Object of Class
		// What is Object? We will discuss in our upcoming Session !!
		
		// Object Construction Statement
		UberApp app = new UberApp(); // app is a reference variable pointing to an Object
		//int[] arr = new int[5];    // Just like how we have Arrays
		
		Scanner scanner = new Scanner(System.in); // System.in is an InputStream which will read from Consoles
		
		System.out.println("Please Enter OTP");
		int otp = scanner.nextInt();
		
		isUserLoggedIn = app.loginUser(9999977777l, otp); // Here Control Jumped to loginUser method
		// Now below written instructions will not be executed till loginUser has finished its execution
		// When loginUser execution is finished, control shall come back to the main
		
		scanner.close(); // to release memory resources
		
		if(isUserLoggedIn){
			
			// Static Method Execution
			fare = UberApp.calculateFare("Pristine Magnum", "Country Homes");
		
			System.out.println("Fare is: "+fare);
			
			// Logical checks if fare is accepted then book the cab
			
			app.bookCab("Pristine Magnum", "Country Homes", 2, 2); // Execution or Calling a Method
			
			System.out.println();
			
			app.bookCab("Redwood Shores", "Country Homes", 1, 2);
			
			System.out.println();
		
		}else{
			System.out.println("Invalid Credentials!!");
		}
		
		
		System.out.println("==Uber Application Finished==");

	} // main finishes here -> when main finished-> program terminates i.e. app is finished

}
