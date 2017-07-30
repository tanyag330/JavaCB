package lect3;

import java.util.Scanner;

public class linear_search {

	public static void main(String[] args) {
		int arr[]=takeinput();
		Scanner scnr=new Scanner (System.in);
		System.out.println("Enter the element to be found  ");
		int e=scnr.nextInt();
        int index =ls(arr,e);
        if(index>=0&&index<arr.length)
        {
        	System.out.println("Element found at "+ index);
        }
        else
        	System.out.println("Element not found ");
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
   public static int ls(int[] arr,int item)
   {
	   int i=0;
	   for(;i<arr.length;i++)
	   {
		   if(arr[i]==item)
		   {
			   break;
		   }
	   }
	   return i;
   }
}
