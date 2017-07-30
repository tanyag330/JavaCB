import java.util.Scanner;
public class Sorting 
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
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void bubblesort(int[] input)
	{
		int temp;
		for (int i=0;i<input.length;i++)
		{
			for(int j=0;j<input.length-i-1;j++)
			{
				if(input[j]>input[j+1])
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
			int[] input=takeinput();
			bubblesort(input);
			printArray(input);
		}
}