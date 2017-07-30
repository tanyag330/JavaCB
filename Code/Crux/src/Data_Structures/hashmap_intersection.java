package datastructure.linklist;

import java.util.HashMap;

public class hashmap_intersection {

	public static void main(String args[]){
		HashMap<Integer, Integer> map = new HashMap();
		int [] input1 = { 7,5,2,7,9,7};
		int [] input2 = { 7,6,2,7,7,3,7};	

		for (int a : input1){
			if( !map.containsKey(a) ){
				map.put(a,1);
			}
			else {
				int currentFreq= map.get(a) ;
				map.put(a, currentFreq +1);
			}
		}


		for (int a : input2){
			if( map.containsKey(a) ){
				if (map.get(a)>0)
				{
					System.out.println(a);
					int currentFreq= map.get(a) ;
					map.put(a, currentFreq -1);
				}
			}
		}
	}
}
