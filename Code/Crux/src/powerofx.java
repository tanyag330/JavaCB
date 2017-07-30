package Java;

public class powerofx {
	public static int power(int x, int n)
	{
		if (n==0)
		{
			return 1;
		}
		return x*power(x,n-1);
	}

	public static int power_logn(int x, int n)
	{
		if (n==0)
		{
			return 1;
		}
		  int half= power_logn(x,n/2);
		  int ans;
	//	if (n==even){
		  ans =half*half;
		/*}
		if (n==odd){
			ans =half*half*x;
			}*/
		  return ans;
	}

	public static void main(String[] args) {
		int number=3;
		int x=3;
		System.out.println(" ans is "+power_logn(x,number));

	}

}
