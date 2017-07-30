import java.util.Scanner;
public class sqroot {
	public static void main(String args[])
	{
		int p=0;
		double i;
		int sqrt=0;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		num=sc.nextInt();
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
