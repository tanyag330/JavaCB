package assignments.ass3;

public class sum_array {

	public static int[] sum_of_arrays (int[]arr1, int[]arr2){
		int []arr3 = new int[arr1.length];
		int carry=0;
		for (int i = arr1.length-1; i >=0; i--)
		{
			int sum = arr1[i] + arr2[i] + carry;
			if (sum > 9)
			{ sum =sum - 10;
			carry=1;
			}
			else{
				carry=0;
			}
			arr3[i]=sum;
		}
		return arr3;
	}
	
	public static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String args[])
	{
		int[] a={1,2,4};
		int[] b={4,5,6};
		int [] arr=sum_of_arrays (a, b);
		printArray(arr);
	}

}