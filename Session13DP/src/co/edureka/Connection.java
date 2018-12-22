package co.edureka;

// SingleTon Example
public class Connection {
	
	// Create Object within the same class
	private static Connection con = new Connection();
	
	private Connection() {
		System.out.println(">> Connection Object Constructed");
	}
	
	public static Connection getConnection(){
		return con;
	}

}
