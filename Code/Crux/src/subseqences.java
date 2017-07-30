package Java1;

import java.util.Scanner;

public class subseqences {

	public static String[] subsequence (String input)
	{
		int n=input.length();
		if (n==0)
		{
			String [] output =new String[1];
			output[0] = " ";
			return output;
		}

		String[] smalloutput = subsequence (input.substring(1));
		String[] output =new String[2*smalloutput.length];
		for (int j=0;j<smalloutput.length;j++)
		{
			output[j] = smalloutput[j];
		}
		for (int j=0,i=smalloutput.length;i<output.length;j++,i++)
		{
			output[i]= input.charAt(0) + smalloutput[j];
		}
		return output;
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String input = s.next();
		String[] a =subsequence (input);
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i] +" " );	
		}
	}
}
