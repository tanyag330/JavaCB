import java.util.Scanner;

public class Duplicate
{
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers in Array :");
		int n = sc.nextInt();
		int input[] = new int[n];
		System.out.println("Enter Array ");
		for(int i = 0; i < n; i++){
			input[i] = sc.nextInt();
		}
		//s.close();
		return input;	
	}
	public static int printduplicate(int[] input)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers in Array :");
		int n = sc.nextInt();
		int input1[] = new int[n];
		int sum=0,sum1=0;
		for(int i=0;i<input.length;i++)
		{
			sum=sum+input[i];
		}
		//System.out.println(+sum);
		for(int j=0;j<=n-2;j++)
		{
			sum1=sum1+j;
		}
	   //	System.out.println(+sum1);
		int num=sum-sum1;
         return num;
}
	public static void main(String args[])
	{
		int[] input=takeInput();
		int b=printduplicate(input);
		System.out.println("number is"+b);
		
	}

}
