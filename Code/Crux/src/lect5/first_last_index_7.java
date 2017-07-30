package lect5;

import lect3.selection_sort;

public class first_last_index_7 {

	public static void main(String[] args) {
//		int[] arr={5,3,7,6,0,7,3};
//		boolean c=contains7(arr);
//		System.out.println(c);
//		int index=firstindex(arr);
//		System.out.println(index);
//		int lindex=lastindex(arr);
//		System.out.println(lindex);
		int[] indices = allIndices(new int[] {1, 8, 3, 5, 8, 9, 8, 2}, 8);
		selection_sort.display(indices);

	}
	public static int c=0;
	public static boolean contains7(int[] a)
	{
		if(a.length==0)
		{
			return false;
		}
		else
		{
			if(a[0]==7)
			{
				return true;
			}
			else
			{
				int [] smaller=new int[a.length-1];
				for(int i=1;i<a.length;i++)
				{
					smaller[i-1]=a[i];
				}
				return contains7(smaller);
						
			}
		}

	}
	public static int firstindex(int[] a)
	{
		if(a.length==0)
		{
			return -1;
		}
			if(a[0]==7)
//				return c;
			return 0;
			else
			{
				int[] smaller=new int[a.length-1];
				for(int i=1;i<a.length;i++)
				{
					smaller[i-1]=a[i];
				}
//				c++;
//				return firstindex(smaller);
			 int firstindexinsmaller=firstindex(smaller);
				if(firstindexinsmaller==-1)
				return -1;
			else
				return firstindexinsmaller+1;
				
			}
		
				
		
	}
	public static int lastindex(int[] a)
	{
		if(a.length==0)
		{
			return -1;
		}
		int[] smaller=new int[a.length-1];
		for(int i=1;i<a.length;i++)
		{
			smaller[i-1]=a[i];
		}
		int index=lastindex(smaller);
		if(index==-1)
		{
			if(a[0]==7)
			{
				return 0;
			}
			else
				return -1;
		}
		else
		{
			return index+1;
		
				
		}
	}
	public static int[] allIndices(int[] arr, int data){
		if(arr.length == 0){
			return new int[0];
		}
		
		int[] smaller = new int[arr.length - 1];
		for(int i = 1; i < arr.length; i++){
			smaller[i - 1] = arr[i];
		}
		
		int[] indicesInSmallerArray = allIndices(smaller, data);
		for(int i = 0; i < indicesInSmallerArray.length; i++){
			indicesInSmallerArray[i] += 1;
		}
		
		if(arr[0] == data){
			int[] bigger = new int[indicesInSmallerArray.length + 1];
			
			for(int i = 0; i < indicesInSmallerArray.length; i++){
				bigger[i] = indicesInSmallerArray[i];
			}
			
			bigger[bigger.length - 1] = 0;
			return bigger;
		}
		else{
			return indicesInSmallerArray;
		}
	}

}
