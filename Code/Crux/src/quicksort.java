package Java;

import java.util.Scanner;

public class quicksort {
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
	public static int returnpivot(int[] input, int beg, int end)
	{
		int count =0;
		int PivotPos=beg; 
		int pivot = input[beg];
		for (int i=beg; i<=end;i++)
		{
			if (input[PivotPos] >input[i])
				count++;	
		}
		int temp = input[beg+count-1];
		input[beg+count-1]= pivot;
		input[PivotPos]=temp;
		
		while (beg<=pivot && end>pivot)
		{ if (end>pivot)
		{
			end--;
		}
		
		else if(beg>=pivot)
		{
			beg++;
		}
		else
		{temp = input[end];
		input[end]=input[beg];
		input[beg]=temp;
		beg++;
		end--;
		}
		}
		return PivotPos;
	}
	public static void quicksort(int[] input, int beg, int end)
	{
		if (beg>end){
			return;
		}
		int pivotPos = returnpivot(input,beg,end);
		quicksort(input,beg,pivotPos-1);
		quicksort(input,pivotPos+1,end);
	}
	public static void main(String args[])
	{
		int[] input=takeinput();
		quicksort(input,0,input.length-1);
		printArray(input);
	}
}
