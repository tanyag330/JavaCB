package Data_Structures;

public class QueueUse {

	
	public static void main(String args[]) throws QueueEmptyException{
		QueueUsingArray q = new QueueUsingArray(5);
		for(int i = 0; i < 5; i++){
			q.enqueue(i);
		}
		for(int i =0; i < 5; i++){
			System.out.println(q.dequeue());
		}
		
	}
	
}
