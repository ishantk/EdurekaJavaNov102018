
public class DataTypes {

	public static void main(String[] args) {
		
		// Single Value Container or Primitives
		// Below containers are creates in the Stack Data Structure in the RAM
		
		// Integral Type
		// age is the name of box(identifier) containing value 30(literal) with a size of 8 bits (capacity)
		// byte -> 8bits -> 2 pow 8 -> 256 -> range -128 to 0 to 127
		byte age = 127; // Write Operation in Storage Container
		age = 60;  		// Update Operation
		System.out.println("age is: "+age); // + is concatenating | Read Operation
		// Delete Operation happens Automatically
		
		short s = 100; 				// 16 bits
		int i = 10000;				// 32 bits
		long l = 1000000000000L;	// 64 bits
		
		// Java stores literal in constant pool in memory
		// Size of literals is by default 32 bits, putting l after literals, they become 64 bits

		// Floating Points
		float f = 3.14f; 			// 32 bits
		double d = 3.14;			// 64 bits
		
		// Java stores floating point literals as a default size of 64 bits in constant pool
		// putting f in the end will make a floating point literal to take size of 32 bits
		
		// Characters
		char ch = 'A'; 				// 16 bits 
		// we store alphabets in single quotes in java
		System.out.println("ch is: "+ch);
		
		ch = 66; 					// assigning an integer value | 66 is ASCII Code for B
		System.out.println("ch now is: "+ch);
		
		ch = '\u0905'; 				// assigning unicode value which is a 4 digit hexadecimal value
		System.out.println("ch now is: "+ch);
		
		// Logical i.e. Boolean
		boolean isInternetAvailable = true;
		//isInternetAvailable = false;
		System.out.println("Is Internet Connection Available: "+isInternetAvailable);
		
		// More than one value not allowed for Primitives
		// int x = 10,20,30; error
		// double y = 2.2,3.3,4.4; error
		// char z = 'A','B','C'; error
	}

}
