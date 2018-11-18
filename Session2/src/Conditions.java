
public class Conditions {

	// main is executed when we run the program
	// anything written in main is executed sequentially i.e. one after another
	public static void main(String[] args) {
		
		// Consider settings of your phone where you enable or disable the internet by clicking on some toggle button
		boolean isInternetConnected = true;
		boolean isGPSConnected = true;
		
		// if/else
		if(isInternetConnected){
			if(isGPSConnected){ // nested if/else
				System.out.println("You can navigate in Google Maps");
			}else{
				System.out.println("Please Enable GPS first !!");
			}
		}else{
			System.out.println("Please Enable Internet First !!");
		}
		
		int physics = 30;
		int chemistry = 40;
		int maths = 60;
		
		int avg = (physics + chemistry + maths)/3;
		
		// Ladder if/else
		if(avg>=80){
			System.out.println("Grade A Awarded for scoring average marks of "+avg);
		}else if(avg>=70 && avg<80){
			System.out.println("Grade B Awarded for scoring average marks of "+avg);
		}else if(avg>=60 && avg<70){
			System.out.println("Grade C Awarded for scoring average marks of "+avg);
		}else if(avg>=50 && avg<60){
			System.out.println("Grade D Awarded for scoring average marks of "+avg);
		}else if(avg>=40 && avg<50){
			System.out.println("Grade E Awarded for scoring average marks of "+avg);
		}else{
			System.out.println("Grade F Awarded for scoring average marks of "+avg);
		}
		
		// Conditions in Real Life:
		// Three different types of cabs in Uber
		int uberGo = 1;
		int uberX = 2;
		int uberMoto = 3;
		
		int userSelection = uberMoto;
		
		if(userSelection == uberGo){
			System.out.println("Uber Go Booked !! Cab Arriving Soon !!");
		}else if(userSelection == uberX){
			System.out.println("Uber X Booked !! Cab Arriving Soon !!");
		}else if(userSelection == uberMoto){
			System.out.println("Uber Moto Booked !! Cab Arriving Soon !!");
		}else{
			System.out.println("Please Select type of Cab First !!");
		}
		
		// An Optimized Version of Ladder if/else
		// Switch Case -> Explore | Use it as an alternative to ladder if/else

	}

}
