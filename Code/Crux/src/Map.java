package DS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Map<K, V> {
	ArrayList<Node<MapPair<K, V>>> buckets;
	int size;

	Map(){
		size=0;
		buckets = new ArrayList<>();
		for(int i=0; i<10; i++){
			buckets.add(null);
		}
	}

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if(size==0)
			return true;
		return false;
	}

	public V get(K key) throws GalatiKarRahaHai{
		int index = getBucketIndex(key);
		if(buckets.get(index)==null){
			GalatiKarRahaHai e = new GalatiKarRahaHai();
			throw e;
		} else {
			Node<MapPair<K, V>> head = buckets.get(index);
			Node<MapPair<K, V>> temp = head;
			while(temp!=null){
				if(temp.data.key.equals(key)){
					return temp.data.value;
				}
				temp=temp.next;
			}
		}
		return null;
	}

	public void put(K key, V value){
		MapPair<K, V> map1 = new MapPair<>();
		map1.key = key;
		map1.value = value;
		int index = getBucketIndex(key);
		Node<MapPair<K, V>> head = buckets.get(index);
		Node<MapPair<K, V>> newNode = new Node<>();
		newNode.data = map1;
		if(head == null){
			head = newNode;
			buckets.set(index, head);      //'set', not 'add'!
			size++;
			return;
		} 
		Node<MapPair<K, V>> temp = head, prev = null;
		while(temp!=null){
			if(temp.data.key.equals(key)){
				temp.data.value = value;
				return;
			}
			prev = temp;
			temp = temp.next;
		}
		prev.next = newNode;
		size++;
		double loadFactor = (1.0*size)/buckets.size();
		if(loadFactor >= 0.75){
			rehash();
		}
	}

	public void remove(K key) throws GalatiKarRahaHai{
		int index = getBucketIndex(key);
		if(buckets.get(index)==null){
			GalatiKarRahaHai e = new GalatiKarRahaHai();
			throw e;
		} else {
			Node<MapPair<K, V>> head = buckets.get(index);
			Node<MapPair<K, V>> temp = head, prev = null;
			while(temp!=null){
				if(temp.data.key.equals(key)){
					if(prev==null){
						buckets.set(index, temp.next);
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
	}

	public int getBucketIndex(K key){
		int index = key.hashCode();
		return index%buckets.size();
	}

	public void rehash(){
		ArrayList<Node<MapPair<K, V>>> current = buckets;
		buckets = new ArrayList<>();
		for(int i=0; i<current.size()*2; i++){
			buckets.add(null);
		}
		size = 0;
		for(int i=0; i<current.size(); i++){
			Node<MapPair<K, V>> head = current.get(i);
			Node<MapPair<K, V>> temp = head;
			while(temp!=null){
				put(temp.data.key, temp.data.value);
				temp=temp.next;
			}
		}
	}
	
	public static ArrayList<Character> showUnique(String s){
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<s.length(); i++){
			Character ch = s.charAt(i);
			if(!map.containsKey(ch)){
				map.put(ch, 1);
			}
		}
		Set<Character> set = map.keySet();
		ArrayList<Character> a = new ArrayList<>();
		for(Character b: set){
			a.add(b);
		}
		return a;
	}
	
	public static void main(String args[]) throws GalatiKarRahaHai{
		Map<String, Integer> map = new Map<>();
		map.put("aa", 1);
		map.put("ba", 2);
		map.put("ca", 3);
		map.put("da", 4);
		map.put("ea", 5);
		map.put("fa", 6);
		map.put("ga", 7);
		map.put("ha", 8);
		map.put("ia", 9);
		map.put("ja", 10);
		map.put("ka", 11);
		map.put("la", 12);
		map.remove("aa");
		System.out.println(map.get("da"));
		System.out.println("Size: "+map.size());
		System.out.println("Empty? : "+map.isEmpty());
		ArrayList<Character> a = showUnique("shreyashishsengupta");
		for(int i=0; i<a.size(); i++){
			System.out.print(a.get(i)+" ");
		}
	}
}