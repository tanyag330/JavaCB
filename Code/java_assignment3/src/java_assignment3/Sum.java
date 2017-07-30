import java.util.Scanner;
public class Sum
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
	public static int findsum(int[] val)
	{
		int sum=0;
		for(int i=0;i<val.length;i++)
		{
			sum=sum+val[i];
		}
		return sum;
	}

	public static void main(String args[])
	{
		int[] val=takeinput();
		int b=findsum(val);
		System.out.println("sum is"+b);
	}

}
