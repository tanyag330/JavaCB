package Java1;

import java.util.Scanner;

public class palindrome {
	public static void printInput(){
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		while(!input.contains("$")){
			System.out.println(input);
			input = s.nextLine();
		}
		
	}
	public static boolean checkPalindrome(String input){
			for(int i=0,j=input.length()-1;i<j;i++,j--){
				if(input.charAt(i) != input.charAt(j)){
					return false;
				}
			}
			
			return true;
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			System.out.println("Enter String");
			String input = s.next();
		
			if(checkPalindrome(input)){
				System.out.println("Is Palindrome");
			}
			else{
				System.out.println("Not Palindrome");
			}
		


	}

}
