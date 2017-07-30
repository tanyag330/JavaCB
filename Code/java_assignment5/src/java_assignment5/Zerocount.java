
public class Zerocount {
	public static int countzero(int num)
	{
		if (num==0)
		{
			return 0;
		}
		if(num%10==0)
		{
			return 1+countzero(num/10);
		}
		return countzero(num/10);
	}
	public static void main(String args[])
	{
		int n=100023004;
		System.out.println("zeros are:"+countzero(n));
	}
}


