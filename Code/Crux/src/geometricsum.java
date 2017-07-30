package Java1;

public class geometricsum {
	public static double geometricsum(int k,int a)
	{
		if(k==0)
		{
			return 1;
		}
		
		a=a*2;
		return (double)1/a + geometricsum(k-1,a);
		
	}
	public static void main(String args[])
	{
		int a=3;
		int b=1;
		System.out.println("sum is :"+geometricsum(a,b));
	}

}
