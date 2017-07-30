package lect2;

import java.util.Scanner;

public class primebtw2_n {

	public static void main(String[] args) {
		int N, No, counter, flag=1;
		No = 2;
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter value of N ");
		N = scnr.nextInt();
		while (No <= N) {
	        counter=2;
	        flag=1;
			while (counter < No) {
				
				if (No % counter == 0) {
					flag = 0;
					break;
				}
				counter = counter + 1;
			}
			if (flag != 0) {
				System.out.println(No);
			}
			
			No = No + 1;
		}

	}

}
