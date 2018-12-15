package co.edureka.model;

// 3 attributes here i.e. id, a and b. id and a shall be inherited
public class CB extends CA{
	
	Integer b;

	public CB() {
	
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "CB [b=" + b + ", id=" + id + ", a=" + a + "]";
	}
	
}
