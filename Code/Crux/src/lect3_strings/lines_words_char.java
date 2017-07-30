package lect3_strings;

import java.util.Scanner;

public class lines_words_char {

	public static void main(String[] args) {
		
          lwc();
	}
	public static void lwc()
	{
		Scanner scnr= new Scanner(System.in);
		boolean done=false;
		int l=0,c=0,w=0;
		while(!done)
		{
			String s=scnr.nextLine();
			w++;
			l++;
			if(s.charAt(0)=='$')
			{
				w--;
				l--;
			}
			for(int i=0;i<s.length();i++)
			{
			 if(s.charAt(i)==' ')
			 {
				 w++;
			 }
			 else if(s.charAt(i)=='$')
			 {
				
				 done = true;
				 break;
			 }
			 c++;
			}
			
		}
		System.out.println("No of lines: "+l);
		System.out.println("No of characters : "+c);
		System.out.println("No of words : "+w);
		
	}

}
