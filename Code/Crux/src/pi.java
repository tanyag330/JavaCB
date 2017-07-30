package Java1;

import java.util.Scanner;

public class pi {
	public static void printInput(){
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		while(!input.contains("$")){
			System.out.println(input);
			input = s.next();
		}

	}


	public static void printCharInSeparateLine(String input){
		for(int i = 0; i < input.length(); i++){
			System.out.println(input.charAt(i));
		}		
	}
	public static String replacepi (String input)
	{
		int n=input.length();
		if (n==0)
		{
			return input;
		}


		String smalloutput = replacepi (input.substring(1));
		if(input.charAt(0)=='p'&& smalloutput.charAt(0)=='i')

		{
			return 3.14+ smalloutput.substring(1);
		}
		else{
			return input.charAt(0)+ smalloutput;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String input = s.next();
			String a = replacepi (input);
			System.out.print(a);
	}
}

