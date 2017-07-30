
public class removeduplicates_R {
	public static void main(String[] args) {
		System.out.println("Cleaning yyzzza: " + stringClean("yyzzza"));
		System.out.println("Cleaning abbcbdd: " + stringClean("abbbcdd"));
		System.out.println("Cleaning Hello: " + stringClean("Hello"));
	}

	private static String stringClean(String str) {
		for(int i = 1; i < (str.length()); i++) {
			if(str.charAt(i-1) == str.charAt(i))
			return stringClean(str.substring(0, i-1) +
			str.substring(i, str.length()));
		}
		return str;      
	}
}
