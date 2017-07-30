import java.util.Scanner;
public class DecimalBinary {
	public static void main(String args[])
	{
		int num,t;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number");
		num=sc.nextInt();
		while(num>0)
		{
			t=num%2;
			num=num/2;
			System.out.println(t);
		}}

}

