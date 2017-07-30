package Java;

import java.util.Scanner;

public class substrings_array {
	public static String[] substring(String input){
		int size= (input.length()*(input.length()+1))/2;
		String a[] = new String [size];
		for (int i=0; i<=input.length()-1; i++)
		{
			for (int j=i; j<input.length()-1;j++)
			{
				int k=0;
				a[k] = input.substring(i,j+1);
				k++;

			}
		}
		return a;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string :");
		String input = s.nextLine();
		String [] b= substring(input);
		for(int i=0; i<b.length; i++)
		{
			System.out.println(" "+b[i]);
		}

	}

}
