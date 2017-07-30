import java.util.Scanner;
public class insertionsort 
{
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int size = sc.nextInt();
		int input[] = new int[size];
		System.out.println("Enter Array ");
		for(int i = 0; i < size; i++)
		{
			input[i] = sc.nextInt();
		}
		return input;	
	}
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void inssort(int[] input)
	{
		int n=input.length;
		for(int j=1;j<n;j++)
		{
			int temp=input[j];
			int i=j-1;
			while((i>=0)&&(input[i]>temp))
			{
				input[i+1]=input[i];
				i--;
			}
			input[i+1]=temp;
		}
		
	}
	public static void amin(String args[])
	{
		int[] input=takeInput();
		inssort(input);
		printArray(input);
	}

}
