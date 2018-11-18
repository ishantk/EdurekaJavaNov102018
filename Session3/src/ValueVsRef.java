
public class ValueVsRef {

	// Non Static Method
	void squareOfANumber(int num){
		int square = num*num;
		System.out.println("Square of "+num+" is: "+square);
	}
	
	void squareOfNumbers(int[] nums){
		
		System.out.println("nums is: "+nums);
		
		for(int i=0;i<nums.length;i++){
			int square = nums[i]*nums[i];
			System.out.println("Square of "+nums[i]+" is: "+square);
			nums[i] = square; // if we modify using nums -> we are also modifying numbers
		}
	}
	
	public static void main(String[] args) {
		System.out.println("==main started==");
	
		ValueVsRef v = new ValueVsRef();
		
		int n = 7;
		v.squareOfANumber(n); 			// Passing the Value
		
		int[] numbers = {1,3,5,7,9,11}; // numbers is a reference variable
		System.out.println("numbers is: "+numbers);
		
		System.out.println("==Before Squaring Numbers==");
		
		// Enhanced For Loop (for-each)
		for(int elm : numbers){
			System.out.print(elm+"  ");
		}
		
		System.out.println();
		
		v.squareOfNumbers(numbers);		// Passing the Reference
		
		System.out.println("==After Squaring Numbers==");
		for(int elm : numbers){
			System.out.print(elm+"  ");
		}
		
		System.out.println();
		
		System.out.println("==main finished==");
		
		// All and any reference type in Java
	}

}
