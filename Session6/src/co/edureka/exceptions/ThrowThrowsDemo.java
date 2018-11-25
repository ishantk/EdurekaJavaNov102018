package co.edureka.exceptions;

import java.io.IOException;

// Creating a user defined CHECKED Exception
class BankingException extends Exception{
	BankingException(String message){
		super(message);
	}
}

//Creating a user defined UNCHECKED Exception
class BankingException1 extends RuntimeException{
	BankingException1(String message){
		super(message);
	}
}

class Banking{
	
	int accBalance = 10000;
	int minBalance = 2000;
	int attempts = 0;
	
	void withdraw(int amt) throws IOException, BankingException {
		accBalance = accBalance - amt;
		if(accBalance < minBalance){
			attempts++;
			accBalance = accBalance + amt;
			System.out.println(">> Withdrawl Failed, Balance is LOW \u20b9"+accBalance);		
		}else{
			System.out.println(">> Withdrawl Successful and New Balance is \u20b9"+accBalance);
		}
		
		// Throwing an Exception by ourselves !!
		// We are crashing the app explicitly
		if(attempts == 3){
			// Throwing an UNCHECKED EXCEPTION (Any Exception which is child of RuntimeException class falls under this category)
			//ArithmeticException aRef = new ArithmeticException("Illeagl Attempts");
			//throw aRef; // Compiler gives no error
			
			//Throwing a CHECKED EXCEPTION (Any Exception which is not the child of RuntimeException class falls under this category)
			//IOException iRef = new IOException("Illeagl Attempts !!");
			//throw iRef; // Now, Compiler is giving us an error -> Checked Exception is checked by compiler
			
			BankingException bRef = new BankingException("Illegal Attempts to Withdraw !!");
			throw bRef; 
		}
	}
	
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		System.out.println(">> Banking Started");
		
		Banking bRef = new Banking();
		// If user tries to attempt unlimited times, bank's resources are occupied
		try{
			for(int i=1;i<=5;i++){
				bRef.withdraw(3000);
			}
		}catch(Exception e){
			System.out.println("Some Exception: "+e);
		}
		
		System.out.println(">> Banking Finished");
	}

}
