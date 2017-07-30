import java.util.Scanner;
public class Reverse1 {
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
	public static void reverse(int input[])
	{
		int temp,j, i;
		for(i=0,j=input.length-1;i<j;i++,j--)
		{
			temp=input[j];
			input[j]=input[i];
			input[i]=temp;
		}
		for(int p=0;p<input.length;p++)
			System.out.print(input[p]+" ");
	}
	public static void main(String args[])
	{
		int[] input=takeinput();
		reverse(input);
	}}