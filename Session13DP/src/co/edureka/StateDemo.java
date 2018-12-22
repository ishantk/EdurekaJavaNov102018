package co.edureka;

interface State{
	String getState();
}

class Ordered implements State{
	public String getState(){
		return "ORDERED STATE";
	}
}

class Shipped implements State{
	public String getState(){
		return "SHIPPED STATE";
	}
}

class Delivered implements State{
	public String getState(){
		return "DELIVERED STATE";
	}
}

class Product{
	
	State state; // HAS-A Relation
	
	void changeState(State newState){
		state = newState;
	}	
}


public class StateDemo {

	public static void main(String[] args) {
		
		Ordered oState = new Ordered();
		Shipped sState = new Shipped();
		Delivered dState = new Delivered();
		
		
		Product product = new Product();
		product.changeState(oState);
		System.out.println("Product State is: "+product.state.getState());
		
		//......
		System.out.println();
		//....
		
		product.changeState(sState);
		System.out.println("Product State is: "+product.state.getState());
		
		//......
		System.out.println();
		//....
		product.changeState(dState);
		System.out.println("Product State is: "+product.state.getState());
	}

}
