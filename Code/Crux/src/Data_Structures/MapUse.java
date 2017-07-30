package datastructure.linklist;

public class MapUse {

	public static void main(String args[]) throws underflowException{

		Map<String, Integer> map = new Map<>();
		map.put("abc", 1);
		map.put("def", 2);
		map.put("ghi", 3);
		map.put("jkl", 4);
		map.put("gi", 7);
		map.put("kai", 5);
		map.put("kei", 9);
		System.out.println(map.get("def"));
		map.remove("def");
		System.out.println(map.get("def"));
		System.out.println("Size: "+map.size());
		
	}
}
