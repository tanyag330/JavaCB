package lect3;

import java.util.Scanner;

public class bubble_sort {

	public static void main(String[] args) {
		int arr[] = takeinput();
		display(arr);
		bubblesort(arr);
		System.out.println("\n Sorted Array is : ");
		display(arr);
	}

	public static int[] takeinput() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int N = scnr.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + "th element ");
			arr[i] = scnr.nextInt();
		}
		return arr;
	}

	public static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void bubblesort(int[] arr) {
		int counter = 1;
		while (counter <= arr.length - 1) {
			for (int i = 0; i < arr.length - counter; i++) {

				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
			counter ++;
		}
	}

}
