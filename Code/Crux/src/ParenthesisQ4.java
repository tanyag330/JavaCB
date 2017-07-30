import java.util.Scanner;

public class ParenthesisQ4 {
	public static boolean parenthesis(String str) {
	    if (str.equals(""))
	    	return true;
	    if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
	        return parenthesis(str.substring(1,str.length()-1));
	    else
	        return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String input = s.next();
		boolean a= parenthesis(input);
		System.out.print(a);
	}
}
