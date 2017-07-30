package Java;

import java.util.Scanner;

public class rotate {
	public static int rotatedarray(int [] input)
	{
		//int input1[]=new int [number];
		int beginning=0;
		int end= input.length-1; 
		int mid;
		mid=(beginning+end)/2;
		while(beginning<=end)
		{	
			if (input[mid] < input[mid-1])
			{
				return mid;

			}
			else if (input[mid]<input[end])
			{
				end = mid-1;

			}
			else if(input[mid]>input[end])
			{
				beginning= mid+1;
			}
	
		}
		return mid;
	}
	public static void main(String[] args) {
		int [] input= { 5 , 1 , 2 ,3,4};
		int num=rotatedarray(input);
		System.out.print("no. of rotation : " +num );
	}

}
