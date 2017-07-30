package Java;

import java.util.Scanner;

public class count_wordsandchar {
	public static int countwordsandchar(String input){
		int words =1;
		int spaces=0;
		for (int charcter=0 ; charcter<input.length();charcter++){
			System.out.println(""+charcter);	
			{ if (!(input.charAt(charcter)=""));
			}
			return 0;
			}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string :");
		String input = s.nextLine();
		countwordsandchar(input);

	}

}
