
public class NestedLoops {

	public static void main(String[] args) {
		
		// Breakpoints are kept on lines which we want to examine !!
		for(int i=1;i<=5;i++){
			
			//System.out.println("i is: "+i); // println prints in a new line
			System.out.println(i);
			
			// Nested Loop i.e. loop within a Loop
			// For single iteration of i, j will iterate 5 times
			for(int j=1;j<=i;j++){
				System.out.print(j+"  "); 	// print prints in the same line
			}
			
			System.out.println(); 			// empty println to go in a new line
			System.out.println(); 
		}

	}

}
