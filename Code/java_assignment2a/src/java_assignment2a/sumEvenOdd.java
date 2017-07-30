package assignments.ass2a;

import java.util.Scanner;

public class sumEvenOdd {
	public static void main(String args[])
	{
		int evensum=0,oddsum=0,num;
		int evennumber,oddnumber;
		int r,d;
		Scanner s=new Scanner(System.in);
		System.out.println("enter num");
		num=s.nextInt();
		while(num!=0)
		{
			r=num%10;
			d=num/10;
			num=d;
			if(r%2==0)
			{
				evennumber=r;
				evensum=evensum+evennumber;

			}
			else
			{
				oddnumber=r;
				oddsum=oddsum+oddnumber;
			}
		}
		System.out.println("sum of even digits:" +evensum);
		System.out.println("sum of odd digits:" +oddsum);
	}
}
