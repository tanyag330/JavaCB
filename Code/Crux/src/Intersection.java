import java.util.Scanner;

public class Intersection 
{
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int size = sc.nextInt();
		int input[] = new int[size];
		System.out.println("Enter Array1 ");
		for(int i = 0; i < size; i++)
		{
			input[i] = sc.nextInt();
		}
		System.out.println("Enter Array2");
		for(int i=0;i<size;i++)
		{
			input[i]=sc.nextInt();
		}
		return input;	
	}
	public static void printintersection(int[] input)
	{
		for(int i=0;i<=input.length-1;i++)
		{
			for(int j=0;j<=input.length-1;j++)
			{
				if(input[i]==input[j])
				{
					System.out.print(+input[j]);
				}
			}
		}

	}

	public static void main(String args[])
	{
		int[] input=takeInput();
		printintersection(input);
		//System.out.println("intersection points are :"+b);
	}
}
