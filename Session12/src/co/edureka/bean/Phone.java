package co.edureka.bean;

// properties shall be inherited from Parent i.e. Product also
public class Phone extends Product{
	
	String os;
	int ram;
	int memory;
	
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", memory=" + memory + ", pid=" + pid + ", name=" + name
				+ ", brand=" + brand + ", tag=" + tag + "]";
	}
	
}
