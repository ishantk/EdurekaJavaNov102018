class Counter{
	// attribute of object
	int count=0;
	
	// attribute of class
	static int sCount=0;
	
	// method of object: which can access class property also
	void incrementCounter(){
		count++;
		sCount++;
	}
	
	// method of object: which can access class property also
	void showCount(){
		System.out.println("count is: "+count+" and sCount is: "+sCount);
	}
}

public class StaticTest {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = c1;
		
		c1.incrementCounter();  // c: 1, sc: 1
		c2.incrementCounter();  // c: 1, sc: 2
		c3.incrementCounter();  // c: 2, sc: 3
		
		c2.incrementCounter();
		c2.incrementCounter();
		c3.incrementCounter();
		
		c1.incrementCounter();
		c1.incrementCounter();
		
		c1.showCount(); // count is: ? and sCount is: ? 
		c2.showCount(); // count is: ? and sCount is: ? 
		c3.showCount(); // count is: ? and sCount is: ? 

	}

}

// PS:
// static belongs to class
// non static belongs to object



