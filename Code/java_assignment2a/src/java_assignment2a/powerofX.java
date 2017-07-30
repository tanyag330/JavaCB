package assignments.ass2a;

import java.util.Scanner;

public class powerofX {
	public static void main(String args[])
	{
		int n,x;
		Scanner s=new Scanner(System.in);
		System.out.println("enter x");
		x=s.nextInt();
		System.out.println("enter n");
		n=s.nextInt();
		int i=1;
		int p=1;
		while(i<=n)
		{
			p=p*x;
			i++;
		}
		System.out.println("power is:"+p);
	}
}
