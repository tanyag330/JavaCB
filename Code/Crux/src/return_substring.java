import java.util.Scanner;

public class return_substring {
	public static String[] substring(String input)
	{
		int i;
		int j;
		int k=0;
		int size=((input.length()*input.length()+1)/2);
		String a[]=new String[size];
		for(i=0;i<=input.length()-1;i++)
		{
			for(j=i;j<input.length()-1;j++)
			{
				a[k]=input.substring(i,j+1);
				k++;
			}
		}
		return a;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String input=s.next();
		System.out.println(input);
		String[] taken=substring(input);
		int i;
		for( i=0;i<taken.length;i++)
		{
			System.out.print(" "+taken[i]);

		}

	}
}
