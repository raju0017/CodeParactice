package basics.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue2 {
	public static void main(String[] args) {
		Queue q= new PriorityQueue();
		q.add(10);
		q.add(4);
		q.add(8);
		q.add(1);
		System.out.println("size:"+q.size());
		while(q.peek()!=null){
			System.out.println(q.poll());
		}
		System.out.println(q.peek());
	}

}
