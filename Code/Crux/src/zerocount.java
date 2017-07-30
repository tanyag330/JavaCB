
package Java1;

public class zerocount {
	public static int zero(int num,int count)
{
	//	int count=0;
		if (num%10 ==0)
		{
			count++;
		}
		if(num !=0)
		{
			return zero(num/10, count);
		}
		return count-1;
	}
	public static void main(String args[])
	{
		int n=10203004;
		int zero = zero(n,0);
		System.out.println("no. of zeroes are:" +zero);
	}
}
