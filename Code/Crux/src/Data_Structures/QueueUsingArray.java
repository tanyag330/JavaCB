package Data_Structures;

public class QueueUsingArray {
	private int data[];
	private int front;
	private int rear;
	private int size;

	public QueueUsingArray(int size) {
		data = new int[size];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size() == 0;
	}
	
	public int front() throws QueueEmptyException{
		if(size() == 0){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		return data[front];
	}
	
	public int dequeue() throws QueueEmptyException{
		if(size() == 0){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		int temp = data[front];
		front++;
		size--;
		if(size() == 0){
			front = -1;
			rear = -1;
		}
		if(front == data.length){
			front = 0;
		}
		return temp;
	}
	
	public void enqueue(int element){
		if(size() == data.length){
			return;
		}
		size++;
		if(rear == data.length -1){
			rear = 0;
			data[rear] = element;
			return;
		}
		rear++;
		data[rear] = element;
		if(front == -1){
			front = 0;
		}
	}

}
