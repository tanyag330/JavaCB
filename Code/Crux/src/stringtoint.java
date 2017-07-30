import java.util.Scanner;

public class stringtoint {
	public static int stringtoint (String input)
	{
		int n=input.length();
		if (n==1)
		{
			return input.charAt(0)-'0';
		}

		int smalloutput = stringtoint (input.substring(0,input.length()-1));
		int lastdigit = input.charAt(input.length()-1)-'0'	;	
			return smalloutput*10+lastdigit;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String input = s.next();
		int a = stringtoint(input);
		System.out.print(a);
	}
}
