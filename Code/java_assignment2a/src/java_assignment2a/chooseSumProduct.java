package assignments.ass2a;

import java.util.Scanner;

public class chooseSumProduct {
	public static void main(String args[])
	{
		int n,sum=0;
		long product=1;
		int choice;
		Scanner s=new Scanner(System.in);
		System.out.println("enter num");
		n=s.nextInt();
		int i=0;
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		int j=1;
		while(j<=n)
		{
			product=product*j;
			j++;
		}
		System.out.println("Want to : sum/product ?");
		choice = s.nextInt();
		
		switch(choice){
		case 1 :
			System.out.println("sum of n numbers:" +sum);
			break;
		case 2 :
			System.out.println("product of n numbers:" +product);
			break;
		}
	}
}