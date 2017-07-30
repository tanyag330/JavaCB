package lect3;

import java.util.Scanner;

public class binary_search {

	public static void main(String[] args) {
		int arr[]=takeinput();
		Scanner scnr=new Scanner (System.in);
		System.out.println("Enter the element to be found  ");
		int e=scnr.nextInt();
        int index =binarysearch(arr,e);
        System.out.println(index);
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
   public static int binarysearch(int[] arr,int item)
   {
	   int beg=0,end=arr.length-1;
	   int mid;
	   while(beg<=end)
	   {
		   mid=(beg+end)/2;
		   if(arr[mid]==item)
		   {
			   return mid;
		   }
		   else if(arr[mid]<item)
		   {
			   beg=mid+1;
			   end=arr.length-1;
		   }
		   else
		   {
			   end=mid-1;
			   beg=0;
		   }

	   }
	   return -1;

	   }
}
