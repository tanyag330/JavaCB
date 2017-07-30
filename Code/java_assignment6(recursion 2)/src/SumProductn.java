import java.util.Scanner;
public class SumProductn 
{
	public static void main(String args[])
	{
		int n,i=0,sum=0,j=1;
		long mul=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		n=sc.nextInt();
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		while(j<=n)
		{
			mul=mul*j;
			j++;
		}
		System.out.println("sum of n numbers:" +sum);
		System.out.println("mul of n numbers:" +mul);
	}
}
