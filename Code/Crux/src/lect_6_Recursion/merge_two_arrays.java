package lect_6_Recursion;

import java.util.Scanner;

public class merge_two_arrays {

	public static void main(String[] args) {
		int a[] = takeinput();// ARRAYS SHOULD BE SORTED
		System.out.println("First Array is : ");
        display(a);
        int b[] = takeinput();
        System.out.println("Second Array is : ");
        display(b);
        System.out.println("\nMerged Array is : ");
        int[] c=merge(a,b);
        display(c);

	}
   public static int[] merge(int[] a,int[] b)
   {
	   int c[]=new int[a.length+b.length];
	   int i=0,j=0,k=0;
	   while(i<a.length&&j<b.length)
	   {
		  if(a[i]<b[j])
		  {
			c[k]=a[i];
			i++;
			k++;
		  }
		  else
		  {
			  c[k]=b[j];
			  j++;
			  k++;
		  }
	   
	   }
	   
		   while(i<a.length)
		   {
		   c[k]=a[i];
		   i++;
		   k++;
		   }
	   
	   
		   while(j<b.length)
		   {
			   c[k]=b[j];
			   j++;
			   k++;
		   }
	   
	   return c;
   }
   public static int[] takeinput()
	{
		Scanner scnr= new Scanner (System.in);
		System.out.println("\nEnter the no of elements ");
		int n=scnr.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+ "th element "); 
			a[i]=scnr.nextInt();
		}
		return a;
	}
   public static void display(int[] a)
   {
   	for(int i=0;i<a.length;i++)
   	{
   		System.out.print(a[i]+" ");
   	}
   }
}
