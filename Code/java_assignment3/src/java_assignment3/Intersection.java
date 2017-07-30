import java.util.Scanner;

public class Intersection 
{
	public static void printintersection(int[] input,int[] input1)
	{
		for(int i=0;i<=input.length-1;i++)
		{
			for(int j=0;j<=input1.length-1;j++)
			{
				if(input[i]==input1[j])
				{
					System.out.print(input1[j]);
				}
			}
		}

	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int size = sc.nextInt();
		int input[] = new int[size];
		int size1 = sc.nextInt();
		int input1[]=new int[size1];
		System.out.println("Enter Array1 ");
		for(int i = 0; i < size; i++)
		{
			input[i] = sc.nextInt();
		}
		System.out.println("Enter Array2");
		for(int j=0;j<size1;j++)
		{
			input1[j]=sc.nextInt();
		}
		//int[] input=takeInput();
		printintersection(input, input1);
		//System.out.println("intersection points are :"+b);
	}
}
