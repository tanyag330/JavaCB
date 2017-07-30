import java.util.Scanner;
public class PosNeg
{
	public static int[] takeinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=sc.nextInt();
		int input[]=new int[size];
		System.out.println("enter array");
		for(int i=0;i<size;i++)
		{
			input[i]=sc.nextInt();
		}
		return input;
	}
	public static void findposneg(int[] val)
	{
		int possum=0,negsum=0;
		for(int i=0;i<val.length;i++)
		{
			if(val[i]>0)
			{
				possum=possum+val[i];
			}

			else 
			{
				if(val[i]<0)
				{
					negsum=negsum+val[i];
				}
			}
		}
		System.out.println("positive sum is :"+possum);
		System.out.println("negative sum is :"+negsum);
	}
	public static void main(String args[])
	{
		int[] val=takeinput();
		findposneg(val);
	}

}



