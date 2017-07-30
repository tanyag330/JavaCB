import java.util.Scanner;

public class SubString
{
	public static void printsubstring(String input)
	{
		int i;
		int j;
		for(i=0;i<=input.length()-1;i++)
		{
			for(j=i;j<=input.length();j++)
			{
				String sub=input.substring(i,j);
				System.out.print(sub);
				System.out.println();
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		System.out.println(input);
		printsubstring(input);
	}
}
