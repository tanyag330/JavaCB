package lect_6_Recursion;

public class Quick_sort {

	public static void main(String[] args) {
	  int[] a={5,9,3,6,2,8};
	  quick_sort(a,0,a.length-1);
      display(a);
	}
   public static void quick_sort(int[] a,int lo,int hi)
   {
	   if(lo>=hi)
	   {
		   return;
	   }
	   int left,right,pi,pivot;
	   pi=(lo+hi)/2;
	   pivot=a[pi];
	   left=lo;
	   right=hi;
	   while(left<=right)
	   {
		   while(a[left]<pivot)
		   {
			   left++;
		   }
		   while(a[right]>pivot)
		   {
			   right--;
		   }
		   if(left<=right)
		   {
			   int temp=a[left];
			   a[left]=a[right];
			   a[right]=temp;
			   left++;
			   right--;
		   }
	   }
	   quick_sort(a,lo,right);
	   quick_sort(a,left,hi);
	   
	   
   }
   public static void display(int[] a)
   {
   	System.out.println("Array is : ");
   	for(int i=0;i<a.length;i++)
   	{
   		System.out.print(a[i]+" ");
   	}
   }

}
