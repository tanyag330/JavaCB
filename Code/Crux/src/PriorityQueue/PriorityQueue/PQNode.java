package PriorityQueue.PriorityQueue;

public class PQNode<T,V> {
	T priority;
	V data;
	
	PQNode(T priority, V data){
		this.data = data;
		this.priority = priority;
		
	}
}
