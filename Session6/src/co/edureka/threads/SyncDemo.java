package co.edureka.threads;

class Printer{
	
	// Synchronized method once executes, acquires a lock which will be released when execution is finsihed.
	// During the lock acquistion no other thread can access the printDocuments method.
	// synchronized void printDocuments(int copies, String docName){
	void printDocuments(int copies, String docName){
		for(int i=1;i<=copies;i++){
			System.out.println(">> Printing "+docName+" | Copy #"+i);
		}
	}
	
	void sayHello(){
		System.out.println(">> Hello from Printer");
	}
}

class PriningThread extends Thread{
	
	Printer pRef;
	
	PriningThread(Printer p){
		pRef = p;
	}
	
	public void run() {
		synchronized (pRef) {
			pRef.printDocuments(10, "MyProfile.pdf");
			pRef.sayHello();
		}	
	}
	
}

class AnotherPriningThread extends Thread{
	
	Printer pRef;
	
	AnotherPriningThread(Printer p){
		pRef = p;
	}
	
	public void run() {
		// synchronized block : acquires the lock on entire object and shall be released only when we exit the block
		synchronized (pRef) {
			pRef.printDocuments(10, "JavaThreadsSession1.doc");
		}	
	}
	
}

public class SyncDemo {

	public static void main(String[] args) {
		System.out.println(">> App Started");

		// A Single Object of Printer:
		Printer printer = new Printer(); 
		//printer.printDocuments(10, "MyProfile.pdf"); 
		
		// We have off-loaded the task of printing from the main thread
		PriningThread th1 = new PriningThread(printer); 				// Passing reference to Printer Object here
		AnotherPriningThread th2 = new AnotherPriningThread(printer);	// Passing reference to Printer Object here
		// Above, both threads are working on same single object !!
		
		
		// Both the threads will execute asynchronously (default behavior) !!
		// We will be seeing outputs which will be mixed up !!
		
		// PS: if multiple threads are working on same single object then we must synchronize them !!
		
		th1.start();
		th2.start();
		
		System.out.println(">> App Finished");
	}

}
