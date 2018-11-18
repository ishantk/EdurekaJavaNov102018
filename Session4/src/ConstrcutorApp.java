class Window{
	
	// Attributes: Property of Object as they are non static
	int width;
	int height;
	
	// Constructors are property of Object and not of class
	// Default Constructor : If we dont create, compiler creates one for us
	Window(){
		width = 1024;
		height = 2048;
	}
	
	// Paramterized Constructor : Takes Inputs
	// Write data in Object only when object shall be constructed
	Window(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	// Constructor Overloading -> Same Name with Different Inputs
	
	// Method : Property of Object as it is non static
	
	// Write data in Object anytime we access it i.e. execute it
	void setWindow(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	void showWindow(){
		System.out.println("Window Created with "+width+" width and "+height+" height");
	}
}


public class ConstrcutorApp {

	public static void main(String[] args) {
		
		Window window1 = new Window(); 				// Window(); 			-> is call to default constructor
		Window window2 = new Window(512, 1024);		// Window(512, 1024); 	-> is call to parameterized constructor
		
		Window window3 = new Window(); // Object shall be constructed with default value for attributes
		//window3.width = 1600;
		//window3.height = 3200;
		
		window1.setWindow(1122, 2233);
		
		window1.showWindow();
		window2.showWindow();
		
		window3.showWindow();
		
	}

}
