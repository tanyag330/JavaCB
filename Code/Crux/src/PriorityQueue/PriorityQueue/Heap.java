package PriorityQueue.PriorityQueue;

import java.util.ArrayList;

public class Heap<V> {

	
	ArrayList<PQNode<Integer,V>> data;
	
	Heap(){
		data  = new ArrayList<>();
		data.add(null);
	}
	
	public int size(){
		return data.size()-1;
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
	
	
	public PQNode<Integer,V> min(){
		if(isEmpty()){
			return null;
		}
		return data.get(1);
	}
	
	public void insert(Integer priority, V value){
		PQNode<Integer,V> newNode = new PQNode<>(priority,value);
		data.add(newNode);
		int childIndex = data.size() -1;
		int parentIndex = childIndex / 2;
		PQNode<Integer,V>  childNode, parentNode;
		
		while(childIndex > 1){
			childNode = data.get(childIndex);
			parentNode = data.get(parentIndex);
			
			if(childNode.priority <  parentNode.priority){
			
				data.set(childIndex, parentNode);
				data.set(parentIndex, childNode);
				childIndex = parentIndex;
				parentIndex = childIndex/2;		
			}
			else{
				return;
			}
		}
	}
	
	
	public PQNode<Integer,V>  removeMin(){
		if(isEmpty()){
			return null;
		}
		
		PQNode<Integer,V> temp = data.get(1);
		data.set(1, data.get(data.size()-1));
		data.remove(data.size()-1);
		heapify(1);
		return temp;
	}

	private void heapify(int index) {
		int leftIndex = 2*index;
		int rightIndex = 2*index + 1;
		if(leftIndex > data.size()-1){
			return;
		}
		
		int minIndex = index;
		
		if(data.get(leftIndex).priority < data.get(index).priority){
			minIndex = leftIndex;
		}
		if(rightIndex <= data.size() -1 && data.get(rightIndex).priority < data.get(minIndex).priority){
			minIndex = rightIndex;
		}
		
		if(minIndex != index){
			PQNode<Integer,V> temp = data.get(index);
			data.set(index, data.get(minIndex));
			data.set(minIndex, temp);
			heapify(minIndex);
		}
		else{
			return;
		}
		
	}
	
	
}
