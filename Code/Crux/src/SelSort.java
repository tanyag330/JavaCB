import java.util.Scanner;
public class SelSort
{
	public static int[] takeInput()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int size = s.nextInt();
		int input[] = new int[size];
		System.out.println("Enter Array ");
		for(int i = 0; i < size; i++)
		{
			input[i] = s.nextInt();
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
	public static void selectionsort(int[] input)
	{
	    int i, j, minIndex, tmp;
	    int n = input.length;
	    for (i = 0; i < n - 1; i++)
	    {
	          minIndex = i;
	          for (j = i + 1; j < n; j++)
	                if (input[j] < input[minIndex])
	                      minIndex = j;
	          if (minIndex != i)
	          {
	                tmp = input[i];
	                input[i] = input[minIndex];
	                input[minIndex] = tmp;
	          }
	    }
	}

public static void main(String args[])
{
	int[] input=takeInput();
	selectionsort(input);
	printArray(input);
}	
}