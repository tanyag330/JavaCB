package Java;

import java.util.Scanner;

public class mergesort {
	public static int [] takeinput()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size= s.nextInt();
		int input[]=new int [size];
		System.out.println("enter array");
		for (int i=0; i<input.length;i++)
		{
			input [i]= s.nextInt();
		}

		return input;
	}
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] mergeArray(int[] input,int[] input1)
	{
		int[] mergeArray= new int [input.length+input1.length];
		int i=0;
		int j=0;
		int k=0;
		while (i<input.length && j<input1.length)
		{ if(input[i]<input1[j])
		{	mergeArray[k]=input[i];
		i++;
		k++;
		}
		else
		{	mergeArray[k]=input1[j];
		j++;
		k++;
		}
		}
		while (i<input.length)
		{	mergeArray[k]=input[i];
		i++;
		k++;
		}
		while (j<input1.length)
		{	mergeArray[k]=input1[j];
		j++;
		k++;
		}

		return mergeArray;
	}
	public static void mergesort(int[] input)
	{
		if(input.length<=1){
			return;
		}
		int begin=0;
		int end= input.length-1; 
		int mid;
		mid=(begin+end)/2;
		int[] Array1 = new int [mid+1];
		int[] Array2 = new int [end-mid];
		for(int i=0; i<=mid;i++){
			Array1[i]=input[i];
			
		}
		for(int j=mid+1, k=0; j<=end;j++,k++){
			Array2[k]=input[j];
		}
			mergesort(Array1);
			mergesort(Array2);

	int[] temp=mergeArray(Array1,Array2);
	for(int i=0; i<temp.length;i++){
		input[i]=temp[i];}
	}
	public static void main(String args[])
	{
		int[] input=takeinput();
		mergesort(input);
		printArray(input);
	}
}
