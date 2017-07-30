package Java;

import java.util.Scanner;

public class basic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size= s.nextInt();
		int input[]=new int [size];
		System.out.println("enter array");
		for (int i=0; i<input.length;i++)
		{
			input [i]= s.nextInt();
		}
	}
}
