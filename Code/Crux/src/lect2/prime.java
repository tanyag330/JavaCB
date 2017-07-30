package lect2;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
	
		int N,counter;
		counter =2;
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter value of N ");
		N = scnr.nextInt();
		while(counter<N)
		{
			if(N%counter==0)
			{
				System.out.println("No is Not Prime ");
				break;
			}
			counter=counter+1;
		}
		System.out.println("No is prime");
	}

}
