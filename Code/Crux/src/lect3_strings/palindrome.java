package lect3_strings;

public class palindrome {

	public static void main(String[] args) {
		String s="madam";
		displaychar(s);
        boolean i=ispalin(s);
        if(i==true)
        {
        	System.out.println("String is palindrome ");
        }
       
	}
	public static void displaychar(String s)
	{
		int l=s.length();
		for(int i=0;i<=l-1;i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	public static boolean ispalin(String s)
	{
		int left=0;
		int right=s.length()-1;
		while(left<right)
		{
			if(s.charAt(left)!=s.charAt(right))
			{
				return false;
		
			}
			left++;
			right--;
		}
		return true;
		
	}
}
