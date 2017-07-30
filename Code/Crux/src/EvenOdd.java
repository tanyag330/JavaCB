import java.util.Scanner;
public class EvenOdd {
	public static void main(String args[])
	{
		int evensum=0,oddsum=0,num;
		int evenno,oddno;
		int r,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		num=sc.nextInt();
		while(num!=0)
		{
			r=num%10;
			d=num/10;
			num=d;
			if(r%2==0)
			{
				evenno=r;
				evensum=evensum+evenno;

			}
			else
			{
				oddno=r;
				oddsum=oddsum+oddno;
			}}
		System.out.println(evensum);
		System.out.println(oddsum);
	}
}
