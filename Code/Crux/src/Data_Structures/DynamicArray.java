package Data_Structures;

public class DynamicArray {

	private int[] data;
	int maxIndex;
	
	public DynamicArray() {
		data = new int[10];
		maxIndex = -1;
	}
	
	public int size(){
		return maxIndex + 1;
	}
	
	public boolean isEmpty(){
		if(size() == 0){
			return true;
		}
		return false;
	}
	
	
	public int get(int index) throws IndexOutofBoundException{
		if(index < 0 || index > maxIndex){
			IndexOutofBoundException e = new IndexOutofBoundException();
			throw e;
		}
		return data[index];
	}
	
	
	public void set(int index,int element) throws IndexOutofBoundException{
		if(index < 0 || index > maxIndex){
			IndexOutofBoundException e = new IndexOutofBoundException();
			throw e;
		}
		data[index] = element;
	}
	
	
	public void add(int element){
		if(maxIndex == data.length -1){
			doubleCapacity();
		}
		maxIndex++;
		data[maxIndex] = element;	
	}

	private void doubleCapacity() {
		int[] temp = new int[2*data.length];
		for(int i =0; i < data.length; i++){
			temp[i] = data[i];
		}
		data = temp;
	}
	
	public void add(int element, int index) throws IndexOutofBoundException{
		if(index < 0 || index > maxIndex+1){
			IndexOutofBoundException e = new IndexOutofBoundException();
			throw e;
		}
		
		if(maxIndex == data.length -1){
			doubleCapacity();
		}
		
		for(int i = maxIndex; i >= index; i--){
			data[i+1] = data[i];
		}
		data[index] = element;
		maxIndex++;
	}
	
	
	public void remove(int index) throws IndexOutofBoundException{
		if(index < 0 || index > maxIndex){
			IndexOutofBoundException e = new IndexOutofBoundException();
			throw e;
		}
		
		for(int i = index; i < maxIndex; i++){
			data[i] = data[i+1];
		}
		data[maxIndex] = 0;
		maxIndex--;
	}
	
	
	public void print(){
		for(int i =0; i <= maxIndex; i++){
			System.out.print(data[i] +" ");
		}
		System.out.println();
		
	}
	
}
