package lect3;

import java.util.Scanner;

public class selection_sort {

	public static void main(String[] args) {
		int arr[] = takeinput();
		display(arr);
		selectionsort(arr);
		System.out.println("\nSorted Array is : ");
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

	public static void selectionsort(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					swap(arr,i,j);
				}
			}
		}
	}

}
