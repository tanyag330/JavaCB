import java.util.Scanner;
public class SortByLength 
	{
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
		public static void printArray(String[] str)
		{
			for(int i = 0; i < str.length; i++)
		{
				System.out.print(str[i]+" ");
			}
		}
		public static void sortstring(String[] input)
		{
		String temp;
			for (int i=0;i<input.length;i++)
			{
				for(int j=0;j<input.length-i-1;j++)
				{
					if(input[j].length()>input[j+1].length())
					{
						temp=input[j+1];
						input[j+1]=input[j];
						input[j]=temp;
					}
				}
			}
		}

		public static void main(String args[])
		{
			String[] input=takeinput();
			sortstring(input);
			printArray(input);
		}

	}

