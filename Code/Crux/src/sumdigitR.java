package Java1;

public class sumdigitR {
	public static int sumdigit(int num,int sum)
	{
		if(num==0)
		{
			return sum;
		}
		sum=sum+num%10;
		num=num/10;
		return sumdigit(num,sum);
		
	}
	public static void main(String args[])
	{
		int n=1234;
		int s=0;
		System.out.println("sum of digits are:"+sumdigit(n,s));
	}
}
