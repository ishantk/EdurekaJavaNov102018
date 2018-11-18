
public class Loops {

	public static void main(String[] args) {
		
		int num = 5;
		int i = 1;
		
		// Printing Table of a Number 5
		// We are repeating 2 same instructions again and again -> Effort for developer
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		
		System.out.println("====While Loop====");
		
		num = 7;
		i = 100;
		
		// Condition is checked before we enter the loop
		while(i<=10){
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}
		
		System.out.println("====Do While Loop====");
		// This loop will definitely execute once even if condition is failing: At Least Once
		// example: ATM Machines
		num = 9;
		i = 100;
		
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}while(i<=10); // condition is checked when we exit the loop
		
		System.out.println("====For Loop====");
		
		/*for(num=11,i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}*/
		
		/*num = 13;
		i = 1;
		for(;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}*/
		
		for(int n=15,j=1;j<=10;++j){
			System.out.println(n+" "+j+"'s are "+(n*j));
		}
		
		
		/* ATM Machine Example : Partial Code
		char ch = 'Y';
		
		do{
			System.out.println("Cash Withdrawl");
			System.out.println("Pin Change");
			System.out.println("Balance Check");
			
			// Logical Part Here

			
			//Lastly ask the user would you like to make another transaction
			// if user says Y repeat the loop
		}while(ch=='Y');
		*/

	}

}
