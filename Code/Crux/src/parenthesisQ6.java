import java.util.Scanner;

public class parenthesisQ6 {
	public static String parenthesis(String str) {
		if (str.length()==0)
			return str;
		if (str.charAt(0) == '(') {
			if (str.charAt(str.length()-1) == ')')
				return str;
			else 
				return parenthesis(str.substring(0, str.length()-1));
		}
		else
			return parenthesis(str.substring(1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String input = s.next();
		String a = parenthesis(input);
		System.out.print(a);
	}
}
