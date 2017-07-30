package Java1;

import java.util.Scanner;

public class numpad_R {
	public static String helper(int c)
	{switch(c){

	case 1:
		return"";
	case 2:
		return"abc";
	case 3:
		return"def";
	case 4:
		return"ghi";
	case 5:
		return"jkl";
	case 6:
		return"mno";
	case 7:
		return"pqrs";
	case 8:
		return"tuv";
	case 9:
		return"wxyz";
	}
	return " ";	
	}
	public static String[] numpad (int input)
	{
		if (input==0)
		{
			String str =helper(input);
			String[] b= new String[1];
			b[0]=str;
			return b;
		}
		String[] smalloutput = numpad (input /10);
		String s =helper(input % 10);
		String[] output =new String[s.length()*smalloutput.length];
		int a=0;
		for (int i=0;i<s.length();i++){
			for (int j=0;j<smalloutput.length;j++)
			{
				output[a]= smalloutput[j]+s.charAt(i);
				a++;
			}	
		}
		return output;
	}
	public static void printnumpad (int input, String outputsofar)
	{

		if (input==0)
		{
			System.out.println(outputsofar);
			return ;
		}
		String s =helper(input % 10);
		for (int i=0;i<s.length();i++){
			printnumpad(input/10, s.charAt(i)+outputsofar);

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int input = s.nextInt();
		String []output = numpad(input);

		for (int i=0;i<output.length;i++){
			System.out.print(" "+output[i]);
		}
	}
}

