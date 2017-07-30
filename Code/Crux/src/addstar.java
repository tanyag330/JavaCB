package Java1;

import java.util.Scanner;

public class addstar {
	public static String addStars(String input){
		if(input.length() < 2){
			return input;
		}
		
		String smallOutput = addStars(input.substring(1));
		//String output;
		
		if(input.charAt(0) == input.charAt(1)){
			return input.charAt(0) + "*" + smallOutput;
		}
		else{
			return input.charAt(0) + smallOutput;
		}
	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String input = s.next();
		String a =addStars (input);
		System.out.print(a);
	}
}
