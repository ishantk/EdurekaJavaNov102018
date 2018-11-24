final class CA{ // which cannot be extended
	// which cannot be re-defined by the child i.e. cannot be overrided
	final void show(){
		System.out.println("This is show of CA");
	}
}

class CB{ //extends CA{
	
	// Re-Defining  -> 	Overriding
	/*void show(){
		System.out.println("This is show of CB");
	}*/
}

public class FinalDemo {

	public static void main(String[] args) {
		
		int i = 10;
		i = 100;
		
		// Value caonnot be modified
		final int j = 10; 	// j becomes constant here
		//j = 100; 			// cannot modify value of j

	}

}
