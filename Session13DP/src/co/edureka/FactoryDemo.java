package co.edureka;

interface Plan{
	void setDataAndPrice();
	void showPlan();
}

class Plan2G implements Plan{
	
	int data;
	int price;
	
	public void setDataAndPrice(){
		data = 1;
		price = 200;
	}
	
	public void showPlan(){
		System.out.println(data+" GB 2G data is available for \u20b9"+price);
	}
}

class Plan3G implements Plan{
	
	int data;
	int price;
	
	public void setDataAndPrice(){
		data = 2;
		price = 300;
	}
	
	public void showPlan(){
		System.out.println(data+" GB 3G data is available for \u20b9"+price);
	}
}

class Plan4G implements Plan{
	
	int data;
	int price;
	
	public void setDataAndPrice(){
		data = 5;
		price = 500;
	}
	
	public void showPlan(){
		System.out.println(data+" GB 4G data is available for \u20b9"+price);
	}
}

class PlanFactory{
	
	public static Plan getPlan(int type){
		
		Plan plan = null;
		
		switch (type) {
			case 2:
				plan = new Plan2G();
				break;
				
			case 3:
				plan = new Plan3G();
				break;
				
			case 4:
				plan = new Plan4G();
				break;	
		}
		plan.setDataAndPrice();
		return plan;
	}
}

public class FactoryDemo {

	public static void main(String[] args) {
		
		Plan plan = PlanFactory.getPlan(4);
		plan.showPlan();
		
	}

}
