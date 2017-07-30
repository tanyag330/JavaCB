package Java;

import java.util.Scanner;

public class max {
	public static int [] takeinput()
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

	public static int min(int[] input)
	{
		int min= input[0];
		for (int i=0; i<input.length ; i++)
		{ if (min>input[i])
		{
			min=input[i];     		
		}
		}return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input= takeinput();
		int min= min(input);
		System.out.println("min is" +min );
	}
}
