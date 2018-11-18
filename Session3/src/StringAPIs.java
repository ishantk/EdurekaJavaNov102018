
public class StringAPIs {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE
		// any operation on strings shall create a new string, old string will not be modified
		String s1 = "I cannot be changed";
		String s2 = s1.toUpperCase();
		
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);
		
		String names = "John, Jennie, Jim, Jack, Joe";
		int l = names.length();
		System.out.println("names contains "+l+" characters");
		int idx = names.indexOf('J');
		System.out.println("idx is: "+idx); // 0
		idx = names.lastIndexOf('J'); 		// 25
		System.out.println("idx now is: "+idx); 
		
		idx = names.indexOf("Jennie");
		System.out.println("idx of Jennie is: "+idx); 
		
		String s3 = names.substring(6);
		System.out.println("s3 is: "+s3);
		
		String s4 = names.substring(6, 11); // 6 inclusive, 11 not inclusive (>=6 till <11)
		System.out.println("s4 is: "+s4);
		
		String songName = "somesong.mp3";
		if(songName.endsWith(".mp3")){
			System.out.println("Its a valid song name");
		}else{
			System.out.println("Invalid Song name");
		}
		
		String email = "john@example.com";
		if(email.contains("@") && email.endsWith(".com")){
			System.out.println("Valid Email");
		}else{
			System.out.println("Invalid Email");
		}
		
		//String names = "John, Jennie, Jim, Jack, Joe";
		if(names.contains("Jack")){
			System.out.println("Jack is in the names");
		}
		
		String[] nameArr = names.split(",");
		for(String str : nameArr){
			System.out.println(str.trim());
		}
			
		char[] chArr = names.toCharArray();
		for(char ch : chArr){
			System.out.print(ch+" ");
		}
		System.out.println();
		
		char ch = names.charAt(1);
		System.out.println("ch is: "+ch);
		
		String newNames = names.replace('J', 'K');
		System.out.println("newNames is "+newNames);
	}

}
