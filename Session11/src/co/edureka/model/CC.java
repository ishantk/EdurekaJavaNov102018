package co.edureka.model;

public class CC extends CB{

	Integer c;
	
	public CC() {
		
	}

	public Integer getC() {
		return c;
	}

	public void setC(Integer c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "CC [c=" + c + ", b=" + b + ", id=" + id + ", a=" + a + "]";
	}
	
}