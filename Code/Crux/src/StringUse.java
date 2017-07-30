import java.util.Scanner;


public class StringUse {
	
	
	public static void printInput(){
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		while(!input.contains("$")){
			System.out.println(input);
			input = s.nextLine();
		}
		
	}
	
	
	public static void printCharInSeparateLine(String input){
		for(int i = 0; i < input.length(); i++){
			System.out.println(input.charAt(i));
		}		
	}
	
	public static boolean checkPalindrome(String input){
	//	int flag = 0;
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
	/*	System.out.println(input.charAt(2));
		int a = input.charAt(0);*/
		
	//String sub = input.substring(2,4);
		/*input = input.concat("def");
		
		System.out.println(input);*/
		/*String input1 = s.next();
		System.out.println(input1);*/
		//printInput();
		
	//	printCharInSeparateLine(input);
		if(checkPalindrome(input)){
			System.out.println("Is Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
		/*String s1 = "abc";
		s1 = "bcd";*/
	}

}
