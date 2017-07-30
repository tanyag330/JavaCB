package lect4;

import java.util.Scanner;

public class spiral_print {

	public static void main(String[] args) {
		int[][] arr = takeinput();
		display(arr);
		System.out.println();
		spiral(arr);
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

	public static void spiral(int[][] a) {
		int rowmin = 0, colmin = 0, colmax = a.length - 1, rowmax = a.length - 1;
		int maxc, c = 0;
		maxc = a.length * a[0].length;
		while (c < maxc) {
			for (int i = rowmin;i <= rowmax; i++) {
				System.out.print(a[i][colmin] + " ");
				c++;
			}
			colmin++;
			for (int i = colmin; i <= colmax; i++) {
				System.out.print(a[rowmax][i] + " ");
				c++;

			}
			rowmax--;
			for (int i = rowmax; i >= rowmin; i--) {
				System.out.print(a[i][colmax] + " ");
				c++;
			}
			colmax--;
			for (int i = colmax; i >= colmin; i--) {
				System.out.print(a[rowmin][i] + " ");
				c++;
			}
			rowmin++;
		}
	}

}
