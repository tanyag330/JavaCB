package lect3_strings;

public class palin_substrings {

	public static void main(String[] args) {

		
	}
	public static int countPalindromes(String str){
		int retVal = 0;
		
		// count odd length palindromes
		for(int axis = 0; axis < str.length(); axis++){
			int dist = 0;
			
			while((axis - dist >= 0) && (axis + dist < str.length()) &&
				  str.charAt(axis - dist) == str.charAt(axis + dist)){
				retVal++;
				dist++;
			}
		}
		
		// count even length palindromes
		for(int axis = 1; axis <= str.length() - 1; axis++){
			int dist = 1;
			
			while((axis - dist >= 0) && (axis + dist - 1 < str.length()) &&
				  str.charAt(axis - dist) == str.charAt(axis + dist - 1)){
				retVal++;
				dist++;
			}
		}
		
		return retVal;
	}

}
