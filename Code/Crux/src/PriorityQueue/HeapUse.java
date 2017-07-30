package PriorityQueue;

public class HeapUse {
	public static void main(String[] args) {
		Heap<Integer> heap = new Heap<>();
		int [] input = { 5,2,6,1,7,8};
		for(int i=0;i<input.length; i++){
			heap.insert(input[i], input[i]);
		}
		
		for(int i=0;i<input.length; i++){
			System.out.println(heap.removeMin().priority);
		}
	}	
}
