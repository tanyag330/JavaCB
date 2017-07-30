

import java.util.Scanner;

public class removex {

	public static void printInput(){
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		while(!input.contains("$")){
			System.out.println(input);
			input = s.nextLine();
		}

	}
	public static String remove(String input)
	{
		int n=input.length();
		if (n==0)
		{
			return input;
		}

		String smalloutput = remove(input.substring(1));
		if(input.charAt(0)=='x')
		{
			return smalloutput;
		}
		else
		{
			return input.charAt(0)+ smalloutput;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String input = s.next();
		String a =remove(input);
		System.out.print(a);
	}
}

