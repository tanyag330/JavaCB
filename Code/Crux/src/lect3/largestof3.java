package lect3;

import java.util.Scanner;

public class largestof3 {

	public static void main(String[] args) {
		int arr[]=takeinput();
		int large=largest(arr);
		System.out.println("Largest element is "+large);

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
    public static int largest(int[] arr)
    {
    	int large=arr[0];
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]>large)
    		{
    			large=arr[i];
    		}
    	}
    	return large;
    		
    }
}
