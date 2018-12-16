package co.edureka.bean;

public class Product {

	int pid;
	String name;
	String brandName;
	int price;
	int stock;
	
	public Product() {
	
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", brandName=" + brandName + ", price=" + price + ", stock="
				+ stock + "]";
	}
	
	// processProductOrder shall be divided into small logical modules -> Concerns
	// In order to implement concerns we must write MethodBeforeAdvice and AfterReturningAdvice
	public void processProductOrder(){
		
		if(User.canOrder){
			System.out.println(">> Process Payments at Checkout");
		}else{
			System.out.println(">> Sorry !! No Stock Available !!");
		}
		
	}
	
}
