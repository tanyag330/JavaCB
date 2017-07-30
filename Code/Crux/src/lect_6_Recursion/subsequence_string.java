package lect_6_Recursion;

public class subsequence_string {

	public static void main(String[] args) {
		String [] substr=subsequence("abcd");
		for(int i=0;i<substr.length;i++)
		{
		System.out.print(substr[i]+" ");
		}	
		String opsofar="";
		printsubsequence("abcd",opsofar);

	}
	public static String[] subsequence(String s)
	{
		if(s.length()==0)
		{
			return new String[] {""};
		}
		char currentchar=s.charAt(0);
		String small=s.substring(1);
		String[] ss=subsequence(small);
		String[] big= new String[2*(ss.length)];
		
		for (int i=0;i<ss.length;i++)
		{
			big[i]=ss[i];
		}
		for(int i=0;i<ss.length;i++)
		{
			big[i+ss.length]=currentchar+ss[i];
		}
		return big;
	}
	public static void printsubsequence(String s,String opsofar)
	{
		if(s.equals(""))
		{
			System.out.println(opsofar);
			return;
		}
		printsubsequence(s.substring(1),opsofar);
		printsubsequence(s.substring(1),opsofar+s.charAt(0));
		
	}

}
