import java.util.Scanner;

public class Largest {
	public static int findmin()
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
		//return input;
		System.out.println("enter minimum");
		int min=input[0];
		for(int i=1;i<size;i++){
			if(min>input[i]){
				min=input[i];
			}
		}
		return min;
	}

	public static void main(String args[])
	{
		int val=findmin();
		System.out.println("minimum is"+val);
	}

}
