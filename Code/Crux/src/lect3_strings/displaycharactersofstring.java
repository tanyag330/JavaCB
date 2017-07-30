package lect3_strings;

import java.util.Scanner;

public class displaycharactersofstring {

	public static void main(String[] args) {
       String s="hello world"  	;
       displaychar(s);

	}
//	public static void takeinput()
//	{
//		System.out.println("Enter the string ");
//		Scanner scnr=new Scanner(System.in);
//		String 
//	}
	public static void displaychar(String s)
	{
		int l=s.length();
		for(int i=0;i<=l-1;i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}
