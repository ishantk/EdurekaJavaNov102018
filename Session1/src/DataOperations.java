
public class DataOperations {

	public static void main(String[] args) {
		
		// MODEL
		// Data In Hand
		double distance = 100; // 100 kms
		double time = 3;	   // 3 hours
		
		// CONTROLLER
		// Data Operation:
		// value 100 from distance container will be divided by 3 from time container and a new value will be created and stored in speed container
		double speed = distance / time;  // / -> divide operation

		// Read Operation
		System.out.println("With distance of "+distance+" kms to be covered in time "+time+" hours we need a speed of "+speed+" kms/hour");
		
		int x = 10;
		int y = 3;
		int z = x % y; // Remainder
		System.out.println("z is: "+z);
		
		x++; // x = x+1 -> 11
		++x; // x = x+1 -> 12
		
		System.out.println("New Value of X is: "+x);
		
		System.out.println("x>y: "+(x>y));
		System.out.println("x!=y: "+(x!=y));
		
		int num1 = 100;
		int num2 = 150;
		int num3 = 200;
		
		System.out.println("Is Num3 Largest: "+ ( (num3>num1) && (num3>num2) ) );
		
	}

}
