package lect5;

public class power {

	public static void main(String[] args) {
		int num=power(2,4);
		System.out.println(num);

	}
	public static int power(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		int X=x*power(x,n-1);
		return X;
	}

}
