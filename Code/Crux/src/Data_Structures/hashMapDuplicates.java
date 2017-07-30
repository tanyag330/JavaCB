package datastructure.linklist;

import java.util.HashMap;

public class hashMapDuplicates {

	public static void main(String args[]){
		HashMap<Integer, Integer> map = new HashMap();
		/*		int [] input = { 7,5,2,7,9,7};
		for (int a : input){
			if( !map.containsKey(a) ){
				System.out.println(a);
				map.put(a,1);
			}
			else {
				int currentFreq= map.get(a) ;
				map.put(a, currentFreq +1);
			}

		}*/
		// sum to zero
		int [] input = { -1,1,-1,1,0,0};
		for (int a : input){
			if( !map.containsKey(a) ){
				map.put(a,1);
			}
			else {
				int currentFreq= map.get(a) ;
				map.put(a, currentFreq +1);
			}
		}

		for (int a : input){
			if(map.containsKey(-1*a) ){
				map.put(a, map.get(a-1));
				System.out.println(a+ ", " + -1*a);
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
	for(int i=0; i<a.size(); i++){
		System.out.print(a.get(i)+" ");
	}
}
