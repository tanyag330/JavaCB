package lect4;

import java.util.Scanner;

public class waveprint {

	public static void main(String[] args) {
		int[][] arr = takeinput();
		display(arr);
		System.out.println();
		dispwave(arr);
	}

	public static int[][] takeinput() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the no of rows ");
		int row = scnr.nextInt();
		int[][] retval = new int[row][];
		for (int i = 0; i < retval.length; i++) {
			System.out.println("enter no of columns for " + (i + 1) + "th row ");
			int col = scnr.nextInt();
			retval[i] = new int[col];
			for (int j = 0; j < retval[i].length; j++) {
				System.out.println("Enter value for" + (i + 1) + "," + (j + 1) + " cell ");
				retval[i][j] = scnr.nextInt();
			}
		}
		return retval;
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void dispwave(int[][] arr) {
		for (int j = 0; j < arr[0].length; j++) {
			if (j % 2 == 0) {

				for (int i = 0; i < arr.length; i++) {

					System.out.print(arr[i][j] + " ");
				}
			}
		else
		{
			for(int i=arr.length-1;i>=0;i--)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		}
	}

}
