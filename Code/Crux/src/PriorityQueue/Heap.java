package PriorityQueue;

import java.util.ArrayList;

public class Heap <V> {

	ArrayList<PQNode<Integer, V>> data = new ArrayList<>();

	Heap (){
		data.add(null);
	}

	public int size(){	
		return data.size() -1;
	}
	public boolean IsEmpty(){
		return size()==0;
	}

	public PQNode<Integer, V > min(){
		if(IsEmpty()){
			return null;
		}
		return data.get(1);
	}

	public void insert(Integer priority, V value){
		PQNode<Integer, V > newnode = new PQNode<>(priority, value);	
		data.add(newnode);
		int ChildIndex = data.size()-1;
		int ParentIndex = ChildIndex/2;

		while(ChildIndex > 1){
			PQNode<Integer, V > ChildNode= data.get(ChildIndex);
			PQNode<Integer, V > ParentNode= data.get(ParentIndex);	
			if (ChildNode.priority < ParentNode.priority){
				data.set(ChildIndex, ParentNode);
				data.set(ParentIndex, ChildNode);
				ChildIndex = ParentIndex;
				ParentIndex= ChildIndex/2;
			}
			else{
				return;
			}
		}		
	}

	public PQNode<Integer, V > removeMin(){
		if(IsEmpty()){
			return null;
		}
		PQNode<Integer, V > temp = data.get(1);
		data.set(1, data.get(data.size()-1));
		data.remove(data.size()-1);
		heapify(1);
		return temp;

	}

	public void heapify( int index) {
		int LeftIndex = 2*index;
		int RightIndex = 2*index+1;
		if (LeftIndex >data.size()-1){
			return;
		}
		int MinIndex = index;
		if(data.get(LeftIndex).priority< data.get(MinIndex).priority){
			MinIndex = LeftIndex;
		}
		if (RightIndex <= data.size()-1 && data.get(RightIndex).priority< data.get(MinIndex).priority){
			MinIndex= RightIndex;
		}
		if(MinIndex!= index){
			PQNode<Integer, V > temp = data.get(index);
			data.set(index, data.get(MinIndex));
			data.set(MinIndex, temp);
			heapify(MinIndex);
		}
		else{
			return;
		}
	}
	
	
}
