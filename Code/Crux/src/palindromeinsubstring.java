package Java;

import java.util.Scanner;

public class palindromeinsubstring {
	public static int substring(String input){
		int count =0;
		for (int i=0; i<=input.length()-1; i++)
		{
			for (int j=i; j<=input.length();j++)
			{ 
				
				String sub = input.substring(i,j);
				/*System.out.print(sub);
				System.out.println();
				 */

				for(int a=0,b=sub.length()-1;a<b;a++,b--){
					count++;
					if(sub.charAt(a) != sub.charAt(b)){
						break;
					}
					count++;
				}
			}
		}
		return count;

	}

	public static int palindromeinsubstring(String input){
		int count =0;
		int beginningval=0;
		int endval= input.length()-1; 
		int midval;
		int k=0;
		int l=0;
		for (int i=0; i<=input.length()-1; i++)
		{
			 
			count++;
			midval=(beginningval+endval)/2;
			
			
		}
		return count;

	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter string :");	
		String input = s.nextLine();
		int k = palindromeinsubstring(input);
		System.out.println("no. of palindrome :" +k);
	}
}

