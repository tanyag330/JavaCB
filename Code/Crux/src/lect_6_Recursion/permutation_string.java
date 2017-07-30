package lect_6_Recursion;

public class permutation_string {

	public static void main(String[] args) {
		String [] substr=rpermutation("abc");
		for(int i=0;i<substr.length;i++)
		{
		System.out.print(substr[i]+" ");
		}	
		String opsofar="";
		printpermutation("abc",opsofar);

	}
	public static String[] rpermutation(String s)
	{
		if(s.length()==1)
		{
			return new String[] {s};
		}
		
		char current=s.charAt(0);
		String small=s.substring(1);
		String[] receive=rpermutation(small);
		String[] big=new String[receive.length*s.length()];
		int counter=0;
		for(int i=0;i<receive.length;i++)
		{
			for(int j=0;j<=receive[i].length();j++)
			{
				big[counter]= receive[i].substring(0,j)+current+receive[i].substring(j);
				
				counter++;
			}
		}
		return big;
		
	}
	public static void printpermutation(String s,String ofsofar)
	{
		if(s.length()==0)
		{
			System.out.println(ofsofar);
		}
		for(int i=0;i<s.length();i++)
		{
			String ros=s.substring(0,i)+s.substring(i+1);
			char ch=s.charAt(i);
			printpermutation(ros,ofsofar+ch);
		}
	}

}
