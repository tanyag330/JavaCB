
package Java1;

public class printsubsequence {
	public static void printsubsequence(String input, String outputsofar)
	{

		if (input.length()==0)
		{
			System.out.println(outputsofar);
			return ;
	}
		
		printsubsequence(input.substring(1), outputsofar+input.charAt(0));
		printsubsequence(input.substring(1), outputsofar);
		
	}
	public static void main(String[] args) {
		String input = "abc";
		printsubsequence(input, "");
	}
}
