package Java1;

public class decimal_binary {
	public void printbinary(int num)
	{
		int binary[]=new int[20];
		int index=0;
		while(num>0)
		{
			binary [index++]=num%2;
			num=num/2;
		}
		for(int i=index-1;i>=0;i--)
		{
			System.out.print(binary[i]);
		}
	}
	public static void main(String args[])
	{
		decimal_binary d1=new decimal_binary();
		d1.printbinary(265);
	}

}
