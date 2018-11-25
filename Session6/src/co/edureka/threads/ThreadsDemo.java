package co.edureka.threads;

// If the task is fetching some data from server, it will depend upon speed of internet and some other factors.
// task may become a long running operation.
// So we must off load the task from main as a separate child thread.
/*class Task{
	void executeTask(){
		// kind of a logic to print documents
		for(int i=1;i<=10;i++){
			System.out.println("** Printing Profile Page #"+i);
		}
	}
}*/

class Task extends Thread{ // Task is a Thread now
	// run is a method where we execute jobs of child thread
	public void run(){
		System.out.println("State4 of TASK: "+Thread.currentThread().getState());
		// kind of a logic to print documents
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("** Printing Profile Page #"+i);
		}
	}
}

class CA{
	
}

//class AnotherTask extends CA, Thread{ // Multiple Inheritance not supported in Java
class AnotherTask extends CA implements Runnable{ // Runnable is used to support a use case where our class is already extending some other class
	// run is a method where we execute jobs of child thread
	public void run(){
		// kind of a logic to print documents
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("@@ Printing Book Page #"+i);
		}
	}
}

public class ThreadsDemo {

	// main method represents jobs of main thread
	public static void main(String[] args) {
		
		System.out.println(">> main thread started");

		// Till the task has not finished its execution
		// Task acts as a blocking job in case it will be a longer operation
		Task task = new Task(); 
		//task.executeTask();
		
		System.out.println("State0 of TASK: "+task.getState());
		
		Runnable r = new AnotherTask(); // Polymorphic Statement
		Thread th = new Thread(r);		
		
		task.setName("John");
		th.setName("Fionna");
		
		// th.setDaemon(true); -> to create a thread as Daemon in our app
		
		// When JVM is occupied
		task.setPriority(Thread.MIN_PRIORITY); // 1
		th.setPriority(Thread.MAX_PRIORITY);   // 10 
		// NORM_PRIORITY -> 5 (default)
		
		System.out.println("State1 of TASK: "+task.getState());
		
		task.start(); // start method will internally execute run method -> Basically some state management happens internally !!
		// Immediately after task is started, we shall execute join method
		try {
			task.join(); // till execution of task isnt finished, all other threads will wait !!
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("State2 of TASK: "+task.getState());
		
		th.start();
		
		// After we have started the task, both task and main runs parallely in the same process.
		// we can say asynchronous execution !!
		
		// below written codes will not execute
		// kind of a logic to print documents
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">> Printing Document #"+i);
		}
		
		
		System.out.println("task name is: "+task.getName()+" and priority is "+task.getPriority());
		System.out.println("anotherTask name is: "+th.getName()+" and priority is "+th.getPriority());
		System.out.println("main name is: "+Thread.currentThread().getName()+" and priority is "+Thread.currentThread().getPriority());
		
		System.out.println(">> main thread finished");
	}

}
