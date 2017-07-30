package datastructure.linklist;

import java.util.ArrayList;

import Data_Structures.Node;

public class Map<K,V> {
	ArrayList<Node<MapPair<K,V>>> buckets = new ArrayList<Node<MapPair<K, V>>>();

	private int size=0;
	{
		for(int i =0; i<2; i++){
			buckets.add(null);
		}
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
	public int getBucketIndex(K key) {
		int bucketCode = key.hashCode();
		int bucketIndex = bucketCode %buckets.size();
		return bucketIndex;
	}

	public V get(K key) {
		int bucketCode = key.hashCode();
		int bucketIndex = bucketCode %buckets.size();
		Node<MapPair<K,V>>head = buckets.get(bucketIndex);

		if(head == null){
			return null;
		}

		Node<MapPair<K,V>>temp =head; 
		while (temp != null){
			if(temp.data.key.equals(key)){
				return temp.data.value;
			}
			temp= temp.next;
		}		
		return null;
	}


	public void put (K key, V value){
		MapPair<K,V> newpair= new MapPair<>();
		int bucketCode = key.hashCode();
		int bucketIndex = bucketCode %buckets.size();
		Node<MapPair<K,V>> newnode =new Node<>();
		Node<MapPair<K,V>>head = buckets.get(bucketIndex);
		Node<MapPair<K,V>>temp =head, prev = null;
		newpair.key = key;
		newpair.value= value;
		newnode.data = newpair;
		if(head == null){
			buckets.set(bucketIndex,newnode ); 
			size++;		
			return;

		}
		else
		{
			while (temp!= null)
			{
				if(temp.data.key.equals(key))
				{
					buckets.set(bucketIndex, newnode);
				}	
				else
				{
					prev= temp;
					temp= temp.next;
				}
				prev.next= newnode;
				size++;
			}
		}
		/*double loadFactor = (1.0*size)/buckets.size();
		if(loadFactor >= 0.75){
			rehash();
		}*/
	}

	public void remove (K key) throws underflowException{
		int bucketCode = key.hashCode();
		int bucketIndex = bucketCode %buckets.size();
		Node<MapPair<K,V>>head = buckets.get(bucketIndex);
		Node<MapPair<K,V>>temp =head, prev = null; 
		if(head == null){
			underflowException e= new underflowException();
			throw e;
		}
		while (!buckets.isEmpty()){
			if(temp.data.key.equals(key)){
				if(prev==null){
					buckets.set(bucketIndex, temp.next);
					size--;
					return;
				} else {
					prev.next = temp.next;
					size--;
					return;
				}

			}
			prev=temp;
			temp=temp.next;
		}
	}

	public void rehash(){
		ArrayList<Node<MapPair<K, V>>> current = buckets;
		buckets = new ArrayList<>();
		for(int i=0; i<current.size()*2; i++){
			buckets.add(null);
		}
		//size = 0;
		for(int i=0; i<current.size(); i++){
			Node<MapPair<K, V>> head = current.get(i);
			Node<MapPair<K, V>> temp = head;
			while(temp!=null){
				put(temp.data.key, temp.data.value);
				temp=temp.next;
			}
		}
	}
}
