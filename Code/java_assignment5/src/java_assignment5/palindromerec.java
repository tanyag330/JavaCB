import java.util.Scanner;
public class palindromerec
{
	public static boolean palindrome(String str)
	{
		if(str.length()==0||str.length()==1)
		{
			return true;
		}
		if(str.charAt(0)==str.charAt(str.length()-1))
		{
			return palindrome(str.substring(1,str.length()-1));
	}
		return false;
	}
	public static void main(String args[])
	{
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the String for check:");
	        String string = scanner.nextLine();
	        if(palindrome(string))
	            System.out.println(string + " is a palindrome");
	        else
	            System.out.println(string + " is not a palindrome");
	    }
	}
	
	


