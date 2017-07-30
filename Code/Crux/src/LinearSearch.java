import java.util.Scanner;
public class LinearSearch 
{
	public static int[] takeinput() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=sc.nextInt();
		int input[]=new int[size];
		System.out.println("enter array");
		for(int i=0;i<size;i++)
		{
			input[i]=sc.nextInt();
		}
		return input;
	}
	public static int findnum(int[] val)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		for(int i=0;i<val.length;i++)
		{
			if(num==val[i])
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		int[] val=takeinput();
		int b=findnum(val);
		System.out.println("index is"+b);
	}
}

