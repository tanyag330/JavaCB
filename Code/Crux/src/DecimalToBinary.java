public class DecimalToBinary
{
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
		DecimalToBinary d1=new DecimalToBinary();
		d1.printbinary(100);
	}

}
