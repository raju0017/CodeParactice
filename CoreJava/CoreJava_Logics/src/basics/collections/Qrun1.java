package basics.collections;

public class Qrun1 {

		public static void main(String[] args){
			QueueImpl q=new QueueImpl();
			q.add(10);
			q.add(20);
			q.add(30);
			System.out.println(q.size());
			System.out.println(q.peek());
			try{
				System.out.println(q.poll());
				
			}
			catch(NullvalueException e){
		
			}
			
		}

		
	}

