package Java;

import java.util.Scanner;

public class bubblesortR {
	public static int[] takeinput() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=s.nextInt();
		int input[]=new int[size];
		System.out.println("enter array");
		for(int i=0;i<size;i++)
		{
			input[i]=s.nextInt();
		}
		return input;
	}
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void bubblesortR(int[] input, int endindex)
	{
		if (endindex<0){
		return;
		}
		//int max=input[endindex];
		int temp;
		for (int i=0;i<input.length-1;i++){
				if(input[i]>input[i+1])
				{
					temp=input[i+1];
					input[i+1]=input[i];
					input[i]=temp;
				}
							}
		
	bubblesortR(input, endindex-1);
	}
	public static void main(String args[])
	{
		int[] input=takeinput();
		bubblesortR(input, input.length-1);
		printArray(input);
	}

}
