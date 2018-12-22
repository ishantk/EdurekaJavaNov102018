package co.edureka;

public class App {

	public static void main(String[] args) {
		
		/*Connection con1 = new Connection();
		Connection con2 = new Connection();
		
		System.out.println("con1 is: "+con1);
		System.out.println("con2 is: "+con2);*/
		
		/*Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		
		System.out.println("con1 is: "+con1);
		System.out.println("con2 is: "+con2);*/
		
		Plan plan = PlanFactory.getPlan(4);
		plan.showPlan();

	}

}
