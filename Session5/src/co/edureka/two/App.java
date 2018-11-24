package co.edureka.two;

import co.edureka.one.One; // To access classes outside the package we need to import them
//import co.edureka.one.Two; // error -> Two is default

// Inheritance across packages
// Across the package private and default is not inherited
// Across the package only public and protected is inherited
// After inheritance protected behaves as private
class CA extends One{
	
	void show(){
		protShow();
		//pvtShow(); // e
		//defShow(); // e
	}
	
}

public class App {

	public static void main(String[] args) {
		
		//One oRef = new One();
		//oRef.pvtShow();  // e 
		//oRef.defShow();  // e
		//oRef.protShow(); // e
		//oRef.pubShow();
		
		// Outside the package we can access only public

		
		CA cRef = new CA();
		cRef.pubShow();
		//cRef.protShow(); // error | protected is inherited but behaves as private
		cRef.show();
	}

}
