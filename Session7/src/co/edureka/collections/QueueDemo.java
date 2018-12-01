package co.edureka.collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--){
			queue.add(i);
		}
		
		// (head)10 9 8 7 6 5 4 3 2 1(tail) | How we Stored
		
		// (head)1 2 3 4 5 6 7 8 9 10(tail) | In Actual (Data will be Sorted)
		
		// Obtain Head of Queue
		/*System.out.println("Queue Size is: "+queue.size());
		System.out.println("Head is: "+queue.peek());
		
		System.out.println();
		
		// Remove the head
		queue.poll();
		System.out.println("Queue Size Now is: "+queue.size());
		System.out.println("Head Now is: "+queue.peek()); // ?
		*/
		
		for(int i=1;i<queue.size();i++){
			System.out.println("Head is "+queue.peek());
			queue.poll(); // Size Decreases
		}
	}

}
