
public class BreakAndContinue {

	public static void main(String[] args) {
		
		// A building with hundrerd floors
		int numOfFloors = 100;
		
		// elevator is at ground level
		int elevator = 0;
		
		// User Wish to go to Floor Number 15
		int floorChoice = 15;
		
		/*for(int i=0; elevator<=floorChoice; elevator++){
			System.out.println(">> Floor Number : "+elevator);
		}*/
		
		/*for(int i=0; elevator<=numOfFloors; elevator++){
			System.out.println(">> Floor Number : "+elevator);
			
			if(elevator == floorChoice){
				System.out.println("** Floor "+floorChoice+" Arrived **");
				break; // terminate the loop
				// No statements after break will be executed.	
			}
		}*/
		
		for(int i=1;i<=10;i++){
			/*if(i > 5){
				break;
			}*/
			if(i<=5){
				continue; // continue takes the loop in next iteration by skipping everything below to be executed in loop
			}
			System.out.println("i is: "+i);
		}
		
		System.out.println("********");
		
		
		// Infinite Loops
		for(int product=1;product>0;product++){
			System.out.println(">> "+product);
			if(product == 100){
				System.out.println("**Product Found**");
				break;
			}
		}
		
		// Amazon has n number of products
		// we need to search a product but linearly | we begin form P1 and will go till Pn 
		

	}

}
