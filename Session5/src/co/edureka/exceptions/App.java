package co.edureka.exceptions;

public class App {

	// main executes statements sequentially i.e. one after the other
	public static void main(String[] args) {
		System.out.println("== App Started==");

		int[] arr = {10, 20, 30, 40, 50};
		System.out.println("arr[1] is: "+arr[1]);
		System.out.println("arr[3] is: "+arr[3]);
		int a=10, b=0, c=0;
		try{
			System.out.println("arr[30] is: "+arr[30]); // This works fine now
			
			c = a/b;
			System.out.println("c is: "+c);
			
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println(">> Some Exception Occurred: "+aRef); // to show to the user if something goes wrong
			//aRef.printStackTrace(); // For Programmers to know details about Exception
		}catch(ArithmeticException aRef){
			System.out.println(">> Some Exception Occurred: "+aRef); // to show to the user if something goes wrong
			//aRef.printStackTrace(); // For Programmers to know details about Exception
		}*/
		catch(Exception e){ // Polymorphism
			System.out.println(">> Some Exception Occurred: "+e); 
		}finally{
			System.out.println("This is important and must be executed");
		}
		System.out.println("== App Finished==");
	}

}
