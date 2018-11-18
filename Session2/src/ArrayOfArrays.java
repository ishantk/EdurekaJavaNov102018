
public class ArrayOfArrays {

	public static void main(String[] args) {
		
		int[] a1 = {10, 20, 30, 40, 50};
		
		// 2-D Array -> Collection of 1-D Arrays
		int[][] a2 = {
						{10, 20, 30},			// 0,3
						{10, 20, 30, 40},		// 1,4
						{10, 20},				// 2,2		-> 	 5
						{10, 20, 30, 40, 50},	// 3,5
						{10}					// 4,1
					 };
		
		// 3-D Array -> Collection of 2-D Arrays
		int[][][] a33 = {
							{
								{10, 20, 30},			// 0,3
								{10, 20, 30, 40},		// 1,4
								{10, 20},				// 2,2		-> 	 5
								{10, 20, 30, 40, 50},	// 3,5
								{10}					// 4,1
						 	},							//						   -> 2	
							{
								{10, 20, 30},			// 0,3
								{10, 20, 30, 40},		// 1,4
								{10, 20},				// 2,2		-> 	 5
								{10, 20, 30, 40, 50},	// 3,5
								{10}					// 4,1
							}
						};
		
		// n-D Array -> Collection of (n-1)D Arrays
						
		
		// a1 and a2 are reference variable having hashCodes to arrays
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		
		System.out.println("a2[0] is: "+a2[0]);
		System.out.println("a2[1] is: "+a2[1]);
		
		System.out.println("a1 length is:"+a1.length);
		System.out.println("a2 length is:"+a2.length);
		
		System.out.println("a2[3] length is:"+a2[3].length);
		
		// Write/Update Operation
		a2[1][1] = 125;
		
		// Read Operation
		System.out.println("a2[3][1] is: "+a2[3][1]); // 20
		
		// Read All
		System.out.println("----------------");
		for(int i=0;i<a2.length;i++){ // 5 times !!
			for(int j=0;j<a2[i].length;j++){ // i:0,j:3 | i:1,j:4 . . .. ..
				System.out.print(a2[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		// Enhanced For Loop for Multi Dim Arrays : EXPLORE
		
		// we try read it as a matrix with 3 rows and 5 columns
		// but we should read it as 3 1-D Arrays with each Array having 5 elements -> Array of Arrays
		int[][] a3 = new int[3][5]; // all the elements are by default 0
		
		a3[0][0] = 10; // ....
		
		// a4 is array of 5 1-D Arrays but sizes of those arrays are not known
		int[][]a4 = new int[5][];
		a4[0] = new int[10];
		a4[1] = new int[5];
		a4[2] = new int[15];
		a4[3] = new int[20];
		a4[4] = new int[3];

	}

}
