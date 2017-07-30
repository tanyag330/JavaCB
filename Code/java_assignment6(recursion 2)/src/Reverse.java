import java.util.Scanner;
public class Reverse {
	public static void main(String args[])
	{
		int num,d,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		r=0;
		while(num>0)
		{
			d=num%10;
			r=r*10+d;
			num=num/10;
		}
		System.out.println("reverse is:"+r);

	}

}

