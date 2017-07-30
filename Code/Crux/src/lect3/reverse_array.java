package lect3;

import java.util.Scanner;

public class reverse_array {

	public static void main(String[] args) {
		int arr[]=takeinput();
		display(arr);
		reverse(arr);
		System.out.println();
		display(arr);

	}
	public static int[] takeinput(){
		Scanner scnr=new Scanner (System.in);
		System.out.println("Enter the length of array : ");
		int N=scnr.nextInt();
		int[]arr=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+(i+1)+"th element ");
			arr[i]=scnr.nextInt();
		}
		return arr;
	}
    public static void display(int[] a)
    {
    	for(int i=0;i<a.length;i++)
    	{
    		System.out.print(a[i]+"  ");
    	}
    }
    public static void reverse(int[] arr)
    {
    	int j=arr.length-1;
    	for(int i=0;i<(arr.length-1)/2;i++)
    	{
    		swap(arr,i,j);
    		j--;
    	}
    }
    public static void swap(int[] a,int i,int j)
    {
    	int temp=a[i];
    	a[i]=a[j];
    	a[j]=temp;
    }
}
