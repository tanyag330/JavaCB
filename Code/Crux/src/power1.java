
import java.util.Scanner;
public class power1{
	public static int power(int n, int x)
	{
		int i,p;
		i=1;
		p=1;
		while(i<=x)
		{
			p=p*n;
			i++;
		}
		return p;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("enter x");
		int x=sc.nextInt();
		int val = power(n,x);
		System.out.println("power is:"+val);
	}
}

