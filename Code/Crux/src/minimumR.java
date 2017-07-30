package Java1;

public class minimumR {
	public static int min(int[] input)
	{
		int min= input[0];
		for (int i=0; i<input.length ; i++)
		{ if (min>input[i])
		{
			min=input[i];     		
		}
		}return min;
	}

	public static int minimumR(int[] input)
	{
		int n=input.length;
		if (n<=1)
		{
			return 0;
		}

		int begin=0;
		int end= input.length-1; 
		int mid;
		mid=(begin+end)/2;
		int[] Array1 = new int [mid+1];
		int[] Array2 = new int [end-mid];
		for(int i=0; i<=mid;i++){
			Array1[i]=input[i];

		}
		for(int j=mid+1, k=0; j<=end;j++,k++){
			Array2[k]=input[j];
		}
		minimumR(Array1);
		minimumR(Array2);

		int temp=min(input);
		return temp;

	}
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int [] input= { 1, 16,0,2 ,5};
		int min = minimumR(input);
		System.out.println("min is" +min );
	
	}

}
