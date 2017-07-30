
public class mul {
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
		int a=17;
		int b=17;
		System.out.println("multiple is:"+multiply(a,b));
	}

}
