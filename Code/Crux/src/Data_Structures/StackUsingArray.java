package Data_Structures;

public class StackUsingArray {

	private int[] data;
	private int top;
	
	
	public StackUsingArray(int size) {
		data = new int[size];
		top = -1;
	}
	
	public boolean isEmpty(){
		if(size() == 0){
			return true;
		}
		return false;
	}
	
	public int size(){
		return top + 1;
	}
	
	public int top() throws StackEmptyException{
		if(size() == 0){
			StackEmptyException e= new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	
	
	public void push(int element) throws StackFullException{
		
		if(top == data.length -1){
			StackFullException e = new StackFullException();
			throw e;
		}
		top++;
		data[top] = element;
		
	}
	
	
	public int pop() throws StackEmptyException{
		if(size() == 0){
			StackEmptyException e= new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
	}
	
	
}
