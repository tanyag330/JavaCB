import java.util.Scanner;

public class Reversestring_R {
	public static String reverse(String str)
	{
		if  (str.length() <= 1) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	System.out.println("Enter String");
	String input = s.nextLine();
	String a=reverse(input);
	System.out.print(a);
}
}
