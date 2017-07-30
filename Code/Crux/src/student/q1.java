package student;

import java.util.Scanner;

public class q1 {
	public static String[] takeinput() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=s.nextInt();
		String input[]=new String[size];
		System.out.println("enter string");
		for(int i=0;i<size;i++)
		{
			input[i]=s.next();
		}
		return input;
	}
	public static void maxlengthword(String[] input)
	{ int a=0;
		int max = input[0].length();
		for(int i=1;i<input.length-1;i++)
		{
			if(max > input[i].length())
			{
				max = input[i].length();
				a=i;

			}
		}
		System.out.print(input[a]+ " ");

	}

	public static void main(String args[])
	{
		String[] input=takeinput();
		maxlengthword(input);
	}
}