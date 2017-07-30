package Java;

import java.util.Scanner;
public class mergeArray {

	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int size = sc.nextInt();
		int input[] = new int[size];
		System.out.println("Enter Array ");
		for(int i = 0; i < size; i++)
		{
			input[i] = sc.nextInt();
		}
		/*System.out.println("Enter Array2");
		for(int J=0;J<size;J++)
		{
			input[J]=sc.nextInt();
		}*/
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
	public static void main(String args[])
	{
		int[] input=takeInput();
		int[] input1=takeInput();
		int[] merge= mergeArray(input,input1);
		printArray(merge);
	}
}
