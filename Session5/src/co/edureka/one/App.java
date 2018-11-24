package co.edureka.one;

public class App {

	public static void main(String[] args) {

		// We can create objects of classes anywhere in the same package
		One oRef = new One();
		Two tRef = new Two();
		
		//oRef.pvtShow(); not accessible
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		//tRef.pvtShow(); not accessible
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();
		
		// Only private is not accessible everything else is accessible in the same package
	}

}
