package PriorityQueue.PriorityQueue;

public class HeapUse {

	
	public static void addToVirtualHeap(int[] input, int Childindex){
		int parentIndex = (Childindex - 1)/2;
		
		while(Childindex > 0){
			if(input[parentIndex] > input[Childindex]){
				int temp = input[parentIndex];
				input[parentIndex] = input[Childindex];
				input[Childindex] = temp;
				Childindex = parentIndex;
				parentIndex = (Childindex - 1)/2;
			}
			else{
				break;
			}
			
		}
	}
	
	
	public static int removeMin(int input[],int size){
		
		int temp = input[0];
		input[0] = input[size - 1];
		
		if(size - 1 > 0){
			heapify(input,0,size-1);
		}
		return temp;
	}
	
	private static void heapify(int[] input, int index, int size) {
		int leftIndex = 2*index + 1;
		int rightIndex = 2*index + 2;
		
		if(leftIndex > size-1){
			return;
		}
		int minIndex = index;
		if(input[leftIndex] < input[minIndex]){
			minIndex = leftIndex;
		}
		if(rightIndex <= size -1 && input[rightIndex] < input[minIndex]){
			minIndex = rightIndex;
		}
		if(minIndex != index){
			int temp = input[minIndex];
			input[minIndex] = input[index];
			input[index] = temp;
			heapify(input, minIndex, size);
		}
		
	}


	public static void main(String args[]){
		int input[] = {5,1,2,4,0};
		/*Heap<Integer> heap = new Heap<>();
		int input[] = {5,2,6,1,7,9};
		
		for(int i = 0; i < input.length; i++){
			heap.insert(input[i],input[i]);
		}
		for(int i = 0; i < input.length; i++){
			System.out.println(heap.removeMin().priority);
		}*/
		for(int i =0; i < input.length; i++){
			addToVirtualHeap(input, i);
		}
		for(int i = 0; i < input.length; i++){
			input[input.length-i-1] = removeMin(input, input.length - i);
		}
		
		for(int i : input){
			System.out.println(i);
		}
		
	}
	
}
