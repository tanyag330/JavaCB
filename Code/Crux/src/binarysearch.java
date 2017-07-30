package Java;

import java.util.Scanner;

public class binarysearch {
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
	public static int binarysearch(int[] input, int a)
	{
		Scanner s = new Scanner(System.in);
		System.out. println("enter no. to be find in array");
		int number = s.nextInt();
		int input1[]=new int [number];
		int beginningval=0;
		int endval= input.length-1; 
		int midval;
		//midval=(beginningval+endval)/2;

		while(beginningval<=endval)
		{	midval=(beginningval+endval)/2;
			if (number == midval)
			{
				return midval;

			}
			else if (number < midval)
			{
				endval= midval-1;


			}
			else 
			{
				beginningval= midval+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [] input= takeinput();
		int  element = s.nextInt();
		System.out.println(binarysearch(input,element));
		
	}

}
