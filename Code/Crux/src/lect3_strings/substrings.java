package lect3_strings;

public class substrings {

	public static void main(String[] args) {
	String s="abcd";
	psub(s);

	}
    public static void psub(String s)
    {
    	for(int i=0;i<s.length();i++)
    	{
    		System.out.println(s.substring(i));
    	}
    }
}
