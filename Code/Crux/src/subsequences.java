import java.util.Scanner;

public class subsequences {
	
	public static String subsequence (String input)
	{
		int n=input.length();
		if (n==0)
		{
			return input;
		}

		String smalloutput = subsequence (input.substring(1));
		if(input.length() > smalloutput.length())
		{
			return input.charAt(0)+ smalloutput;
		}
		else {
			return smalloutput;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String input = s.next();
		String a =subsequence (input);
		System.out.print(a);
	}
}
