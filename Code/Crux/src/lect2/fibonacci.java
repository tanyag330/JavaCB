package lect2;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int N,x=1,y=0,z;
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter value of N ");
		N = scnr.nextInt();
		while(x<=N)
		{
			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
	}

}
