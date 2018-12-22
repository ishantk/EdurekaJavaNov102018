package co.edureka;

interface Cab{
	String getCab();
	int getCabFare();
}

class RegularCab implements Cab{
	public String getCab(){
		return "Regular Cab Booked !";
	}
	public int getCabFare(){
		return 100;
	}
}

abstract class CabDecorator implements Cab{
	Cab cab;
	CabDecorator(Cab cab){
		this.cab = cab;
	}
	public String getCab(){
		return cab.getCab();
	}
	public int getCabFare(){
		return cab.getCabFare();
	}
}

class SharedCab extends CabDecorator{
	
	SharedCab(Cab cab){
		super(cab);
	}
	
	public String getCab(){
		return super.getCab()+" Cab is Shared for a less of 30";
	}
	public int getCabFare(){
		return super.getCabFare()-30;
	}
	
}

class LuxuryCab extends CabDecorator{
	
	LuxuryCab(Cab cab){
		super(cab);
	}
	
	public String getCab(){
		return super.getCab()+" Upgraded to Luxury for an additional 100 Rs";
	}
	public int getCabFare(){
		return super.getCabFare()+100;
	}
	
}


public class DecoratorDemo {

	public static void main(String[] args) {
		
		// Polymorphic Statements
		
		Cab cab1;
		
		cab1 = new RegularCab();
		System.out.println(cab1.getCab());
		System.out.println("Fare Details: "+cab1.getCabFare());
		
		System.out.println();
		
		
		Cab cab2 = new SharedCab(cab1);
		System.out.println(cab2.getCab());
		System.out.println("Fare Details: "+cab2.getCabFare());
		
		System.out.println();
		
		Cab cab3 = new LuxuryCab(cab1);
		System.out.println(cab3.getCab());
		System.out.println("Fare Details: "+cab3.getCabFare());
		
	}

}
