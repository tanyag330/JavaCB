package Java1;

public class multiply {
	public static int multiply(int m,int n)
	{
		if(n==0)
		{
			return 0;
		}
		return m+multiply(m,n-1);
	}
	public static void main(String args[])
	{
		int a=7;
		int b=13;
		System.out.println("multiple is:"+multiply(a,b));
	}
}
