import java.util.Scanner;
public class SumProduct {
public static void main(String args[])
{
	int num,r,d,sum=0,mul=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num");
	num=sc.nextInt();
	while(num!=0)
	{
		r=num%10;
		d=num/10;
		num=d;
		sum=sum+r;
		mul=mul*r;
	}
	System.out.println("sum is:"+sum);
	System.out.println("mul is:"+mul);
}
}
