package datastructure.linklist;

public class QueueusingLL <T> {

	private node<T> front;
	private node<T> rear;
	private int size;

	public  QueueusingLL(){
		front = null;
		rear=null;
		size=0;

	}

	public int size(){
		return size;
	}
	public boolean isempty(){
		if (size ==0){
			return true;
		}
		return false;
	}
	public T front() throws QueueEmptyException{
		if (size ==0){
			QueueEmptyException e= new QueueEmptyException();
			throw e;
		}
		return front.data;

	}
	public void enqueue (T data){

		node<T> newnode = new node<>();
		newnode.data=data;
		if(front==null && rear==null){
		front=newnode;
			rear=newnode;
			size++;
			return;
		}
		rear.next = newnode ;
		rear = rear.next;
		size++;
	}

	public T dequeue() throws QueueEmptyException{
		if (size ==0){
			QueueEmptyException e= new QueueEmptyException();
			throw e;
		}
		T temp= front.data;
		size--;
				
		if (front==rear){
			rear=null;
		}
		front=front.next;	
		return temp;
	}
}
