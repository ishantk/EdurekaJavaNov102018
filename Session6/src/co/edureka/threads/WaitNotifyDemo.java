package co.edureka.threads;

class Message{
	
	String message = ">> No Message Available";
	
	void writeMessage(){
		message = "Search the candle rather than cursing the darkness !!";
		System.out.println(">> Message Written");
	}
	
	void readMessage(){
		System.out.println(">> Message Content: "+message);
	}
}

// Performs a Read operation
class ReaderThread extends Thread{
	
	Message mRef;
	
	ReaderThread(Message m){
		mRef = m;
	}
	
	public void run() {
		synchronized (mRef) {
			
			try {
				mRef.wait(); // ReaderThread will now wait to be notified to further resume its execution on mRef
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			mRef.readMessage();
		}
	}
}

// Performs a Write operation
class WriterThread extends Thread{
	
	Message mRef;
	
	WriterThread(Message m){
		mRef = m;
	}
	
	public void run() {
		synchronized (mRef) {
			mRef.writeMessage();
			//mRef.notify(); // Notifying to the thread who is waiting on mRef
			mRef.notifyAll();
		}
	}
}

public class WaitNotifyDemo {

	public static void main(String[] args) {
	
		// A Single Object of Message
		Message m = new Message();
		
		// we are passing the same message object reference in both reader and writer threads
		ReaderThread rt1 = new ReaderThread(m);
		ReaderThread rt2 = new ReaderThread(m); 
		WriterThread wt = new WriterThread(m);
		
		rt1.start();
		rt2.start();
		
		wt.start();

	}

}
