package co.edureka.langdemo;

public class WrapperDemo {

	public static void main(String[] args) {
		
		// Primitive Type
		int i = 10;
		char c = 'A';
		double d = 2.2;
		
		// We can wrap primitives into objects !!
		
		// BOXING : We are putting up a primitive into an Object
		Integer iRef = new Integer(i); 
		Character cRef = new Character(c);
		Double dRef = new Double(d);
		
		// UNBOXING : We are extracting primitive out of Object
		int j = iRef.intValue();
		char ch = cRef.charValue();
		double e = dRef.doubleValue();
		
		// AUTOBOXING
		Integer iRef1 = i; 	// Integer iRef1 = new Integer(i);
		
		// AUTO UNBOXING
		int k = iRef1; 		// int k = iRef1.intValue();
		
		System.out.println("iRef is: "+iRef);
		System.out.println("iRef is: "+iRef.toString());
	}

}
