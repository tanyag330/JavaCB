import java.util.Scanner;
public class Count
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(input);
		int words=0;
		int characters=0;
		int spaces=0;
		for(int i=0;i<input.length();i++)
		{
			if((input.charAt(i) != ' '))
			{
				characters++;
			}
			else
			{
				if(input.charAt(i+1) != ' ')
				{
					words++;
				}
			}
		}
		System.out.println("words are"+words+1);
		System.out.println("characters are"+characters);
	}
}