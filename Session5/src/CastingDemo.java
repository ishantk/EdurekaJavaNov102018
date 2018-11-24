class X{ // Parent
	
}

class Y extends X{ //Child
	
}

interface P{
	
}

class Q implements P{
	
}

public class CastingDemo {

	public static void main(String[] args) {
		
		byte b = 100;
		int i = b; // OK? Because i is 32 bit and b id 8 bit | Up-Casting
		
		// Down-Casting
		byte c = (byte)i; // Not OK !! Even though i contains just 100 which can be accomodated by byte easily

		//***************
		
		X xRef = new Y(); // Up-Casting | Polymorphic Statement
		Y yRef = (Y)xRef; // Down-Casting
		
		//*************
		P pRef = new Q(); // Up-Casting | Polymorphic Statement
		Q qRef = (Q)pRef; // Down-Casting
	}

}
