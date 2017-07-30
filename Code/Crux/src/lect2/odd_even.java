package lect2;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		int N, osum, esum, counter;
		osum = 0;
		esum = 0;
		counter = 1;
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter value of N ");
		N = scnr.nextInt();
		while (counter <= N) {
			if (counter % 2 == 0) {
				esum = esum + counter;
			} else {
				osum = osum + counter;
			}

			counter = counter + 1;
		}
		System.out.println("sum of even nos is:" + esum);
		System.out.println("sum of odd nos is:" + osum);

	}

}
