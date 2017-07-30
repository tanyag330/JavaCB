import java.util.Scanner;
public class Smallest
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
	public static int findmin(int[] val)
	{
		System.out.println("enter minimum");
		int min=val[0];
		for(int i=1;i<val.length;i++){
			if(min>val[i]){
				min=val[i];
			}
		}
		return min;
	}

	public static void main(String args[])
	{
		int[] val=takeinput();
		int b=findmin(val);
		System.out.println("minimum is"+b);
	}

}
