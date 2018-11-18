
public class MutableStrings {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE
		String str = new String("Hello");
		String newString = str.concat(" World");
		
		System.out.println("str is: "+str);
		System.out.println("newString is: "+newString);
		
		
		// MUTABLE Versions of String
		StringBuffer buffer = new StringBuffer("Hello"); 		// Thread-Safe
		buffer.append(" World");
		
		StringBuilder builder = new StringBuilder("Hello");		// Not Thread-Safe
		builder.append(" World");
		
		System.out.println("buffer is: "+buffer);
		System.out.println("builder is: "+builder);

	}

}
