package Java;

import java.util.Scanner;

public class multid_array {
	public static int [][] takeinput2d()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter first array");
		int m= s.nextInt();
		System.out.println("enter second array");
		int n = s.nextInt();
		int input[][]=new int [m][n];

		for (int i=0; i<m;i++)
		{
			for(int j=0; j<n;j++)
			{
				System.out.println("enter element in "+i+" row and "+j+"column:");
				input [i][j]= s.nextInt(); 
			}
		}
		return input;
	}
	public static void print2Darray(int[][] input)
	{
		int m = input.length;
		int n = input[0].length;

		for(int j=0; j<n;j++)
		{
			if (j%2==0)
			{
				for (int i =0; i<m;i++)
				{
					System.out.print(input[i][j]+" ");
				}

			
			}
			else
			{
				for (int i =m-1; i>=0;i--)
				{
					System.out.print(input[i][j]+" ");
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		int [][] input2d= takeinput2d();
		print2Darray(input2d);
	}
}