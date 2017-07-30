package Java;

import java.util.Scanner;

public class substrings {

	public static void substring(String input){
		for (int i=0; i<=input.length()-1; i++)
		{
			for (int j=i; j<=input.length();j++)
			{
				String sub = input.substring(i,j);
				System.out.print(sub);
				System.out.println();

			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println("enter string :");
		substring(input);


	}

}
