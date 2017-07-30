package Java1;

import java.util.Scanner;

public class pairs {
	public static int[] takeInput()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int size = s.nextInt();
		int input[] = new int[size];
		System.out.println("Enter Array ");
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;	
	}
	public static void pairelements(int[] input)
	{
		int x;
		Scanner s=new Scanner(System.in);
		System.out.println("enter x");
		x=s.nextInt();
		for(int i=0;i<=input.length-1;i++)
		{
			for(int j=i+1;j<=input.length-1;j++)
			{
				int r=input[i]+input[j];
				if(r==x)
				{
					System.out.println(input[i]+","+input[j]);

				}
			}

		}
	}
		public static void main(String args[])
		{
			int[] input=takeInput();
			pairelements(input);

		}

	}
