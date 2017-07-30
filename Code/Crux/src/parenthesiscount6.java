import java.util.Scanner;

public class parenthesiscount6 {
	public static String parenthesis(String str) {
		if (str.length()==0)
			return str;
		int flag =0;
		if(str.charAt(0)!='(')
		{
		flag =1;	
		}
		else 
		{
			flag=0;	
		}
		if(flag==1){
			return parenthesis(str.substring(1));
		}
		else 
			return str.charAt(0)+ parenthesis(str.substring(1));
	/*	String smalloutput = parenthesis(str.substring(1));
		
		if(str.charAt(0)!='(')
		{
			return smalloutput;
		}
		else
		{
			return str.charAt(0)+ smalloutput;
		}*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String input = s.next();
		String a = parenthesis(input);
		System.out.print(a);
	}
}
