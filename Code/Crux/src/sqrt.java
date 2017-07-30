package Java1;

import java.util.Scanner;

public class sqrt {
	public static void main(String args[])
	{
		int p=0;
		double i=0;
		double sqrt=0;
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter num");
		num=s.nextInt();
		while(i<=p)
		{
			i=Math.pow(10,(-1*p));
		}
		while(sqrt*sqrt<=num)
		{
			sqrt=sqrt+i;
		}
		System.out.println(sqrt);
}
}
