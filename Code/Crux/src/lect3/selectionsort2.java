package lect3;

import java.util.Scanner;

public class selectionsort2 {

	public static void main(String[] args) {
		int arr[] = takeinput();
		display(arr);
		int a[]=selectionsort(arr);
		System.out.println("\nSorted Array is : ");
		display(a);

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
	public static int findlargest(int[] arr,int l)
	{
		int large=arr[0];
		for(int i=1;i<arr.length-1-l;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
		}
		return large;
		
	}

	public static int[] selectionsort(int[] arr) {
		int c=0;
	    int[] a = new int[arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			
		    int max = findlargest(arr,c);
		    a[i]=max;
		    c++;
		}
		return a;
		
	}
	


}
