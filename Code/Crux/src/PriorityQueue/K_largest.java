package PriorityQueue;

import java.util.Scanner;

public class K_largest {
	
	public static void main(String[] args) {
		Heap<Integer> heap = new Heap<>();
		int [] input = { 5,2,6,1,7,8};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter k");
		int k= s.nextInt();
		for(int i=0;i<k; i++){
			heap.insert(input[i], input[i]);
		}
		for(int i=k;i<input.length-1; i++){
			int index =0;
			if(heap < input[i]){
			System.out.println(heap.removeMin().priority);
			//heapify();
			}
		}
	}
}