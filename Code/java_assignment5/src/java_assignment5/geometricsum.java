
public class geometricsum 
{
	public static double geosum(int k,int a)
	{
		if(k==0)
		{
			return 1;
		}
		
		a=a*2;
		return (double)1/a + geosum(k-1,a);
		
	}
	public static void main(String args[])
	{
		int a=3;
		int b=1;
		System.out.println("sum is :"+geosum(a,b));
	}

}
