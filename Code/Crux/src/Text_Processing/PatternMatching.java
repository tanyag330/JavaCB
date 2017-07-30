package Text_Processing;

import java.util.HashMap;

public class PatternMatching {

	
	public static int bruteForce(String text, String pattern){
		
		for(int i =0; i <= text.length() - pattern.length(); i++){
			int j =0;
			while(j < pattern.length() && text.charAt(i + j) == pattern.charAt(j)){
				j++;
			}
			if(j== pattern.length()){
				return i;
			}
		}
		return -1;
	}
	
	private static HashMap<Character, Integer> lastIndex(String pattern) {
		HashMap<Character, Integer> output = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {
			output.put(pattern.charAt(i), i);
		}
		return output;
	}
	
	
	public static int BoyerMoore(String text, String pattern) {
		HashMap<Character, Integer> lastIndices = lastIndex(pattern);
		int i = pattern.length() - 1;
		while (i < text.length()) {
			boolean flag = true;
			for (int j = 0; j < pattern.length(); j++) {
				if (text.charAt(i - j) != pattern.charAt(pattern.length() - j - 1)) {
					char badChar = text.charAt(i - j);
					if (!lastIndices.containsKey(badChar)) {
						i = i -j + pattern.length();
					} else {
						int lastIndexBadChar = lastIndices.get(badChar);
						if (lastIndexBadChar > pattern.length() - j - 1) {
							i++;
						} else {
							i = i + pattern.length() - lastIndexBadChar - j -1;
						}
					}
					flag = false;
					break;
				}
 			}
			if (flag)
				return i - pattern.length() + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(BoyerMoore("this is a test string", "str"));

	}

}
