import java.util.Scanner;
public class Power {
	public static void main(String args[])
	{
		int x,n,i,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		n=sc.nextInt();
		System.out.println("enter x");
		x=sc.nextInt();
		i=1;
		p=1;
		while(i<=x)
		{
			p=p*n;
			i++;
		}
		System.out.println("power is:"+p);
	}
}

