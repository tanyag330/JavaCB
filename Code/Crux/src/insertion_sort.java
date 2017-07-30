package Java;

import java.util.Scanner;

public class insertion_sort {

	public static int [] takeInput()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size= s.nextInt();
		int input[]=new int [size];
		System.out.println("enter array");	
		for (int i=0; i<input.length;i++)
		{input [i]= s.nextInt();
		}
		return input;
	}
	

	public static void printArray(int[] a)
	{
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i] +" " );	
		}
	}
	public static void inssort(int[] input)
	{
		int n=input.length;
		for(int j=1;j<n;j++)
		{
			int temp=input[j];
			int i=j-1;
			while((i>=0)&&(input[i]>temp))
			{
				input[i+1]=input[i];
				i--;
			}
			input[i+1]=temp;
		}
		
	}
	public static void main(String args[])
	{
		int[] input=takeInput();
		inssort(input);
		printArray(input);
	}

}