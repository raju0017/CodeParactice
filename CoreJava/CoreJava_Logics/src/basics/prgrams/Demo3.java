package basics.prgrams;
import java.util.LinkedList;
import java.util.Queue;

public class Demo3 {

		public static void main(String[] args) {
			Queue q= new LinkedList();
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