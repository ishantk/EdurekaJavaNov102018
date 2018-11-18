
public class JavaStrings {

	public static void main(String[] args) {
		
		// str1 is a reference variable, Hello is a literal
		// String is data type -> not a primitive one but a reference one
		
		// Interned Way
		String str1 = "HeLlo";
		String str2 = "Hello";
		
		// Object Way
		String str3 = new String("Hello");
		String str4 = new String("HeLlO");
		
		// We are printing reference variables
		// We get to see the hashCodes | In case of Strings we aren't able to see the hashCodes but the data itself
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);
		
		// Compiler will execute a toString() method when we print reference variables for Strings
		// And toString() method gives data instead of hashCodes
		/*System.out.println("str1 with toString is: "+str1.toString());
		System.out.println("str2 with toString is: "+str2.toString());
		System.out.println("str3 with toString is: "+str3.toString());
		System.out.println("str4 with toString is: "+str4.toString());*/
		
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		// Content Comparison
		//if(str1.equals(str2)){
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("str1 equals str2");
		}else{
			System.out.println("str1 not equals str2");
		}
		
		//if(str3.equalsIgnore(str4)){
		if(str3.equalsIgnoreCase(str4)){
			System.out.println("str3 equals str4");
		}else{
			System.out.println("str3 not equals str4");
		}
		
		//if(str1.compareTo(str2) == 0){
		if(str1.compareToIgnoreCase(str2) == 0){
			System.out.println("str1 comapred to str2");
		}else{
			System.out.println("str1 not comapred to str2");
		}
		
		if(str3.compareTo(str2) == 0){
			System.out.println("str3 comapred to str4");
		}else{
			System.out.println("str3 not comapred to str4");
		}
		
	}

}
