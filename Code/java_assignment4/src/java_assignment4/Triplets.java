import java.util.Scanner;
public class Triplets 
{
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int size = sc.nextInt();
		int input[] = new int[size];
		System.out.println("Enter Array ");
		for(int i = 0; i < size; i++){
			input[i] = sc.nextInt();
		}
		return input;	
	}
	public static void tripletelements(int[] input)
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x");
		x=sc.nextInt();
		for(int i=0;i<=input.length-3;i++)
		{
			for(int j=i+1;j<=input.length-2;j++)
			{
				for(int k=j+1;k<=input.length-1;k++)
				{
				int r=input[i]+input[j]+input[k];
				if(r==x)
				{
					System.out.println(input[i]+","+input[j]+","+input[k]);

				}
				}
			}

		}
	}
	public static void main(String args[])
	{
		int[] input=takeInput();
		tripletelements(input);

	}

}

