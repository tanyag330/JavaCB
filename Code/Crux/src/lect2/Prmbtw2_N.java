package lect2;

import java.util.Scanner;

public class Prmbtw2_N {

	public static void main(String[] args) {
		int N, Num = 2;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter value of N ");
		N = scnr.nextInt();
		while (Num <= N) {

			int c = 2;
			boolean isprime = true;
			while (c < Num) {

				if (Num % c == 0) {
					isprime = false;
					break;
		
				}
				c++;
				
			}
				if (isprime == true) {
					System.out.println(Num);
				}
			
			Num ++;
		}

	}

}
