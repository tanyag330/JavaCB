package text_process;

public class ed {
	
	public static int EditDistance(String s ,String t){
		int m = s.length();
		int n = t.length();
		if(m==0)
			return n;
		if(n==0)
			return m;
		if(m==0 && n==0)
			return 0;
		
		if (s.charAt(0)==t.charAt(0))
			return  EditDistance(s.substring(1),t.substring(1));
		else
			return  1+ Math.min(EditDistance(s.substring(1),t.substring(1)), 
					(Math.min(EditDistance(s.substring(1),t), EditDistance(s,t.substring(1)))))	;
	}
	public static void main(String[] args) {
		String s= "abcd";
		String t= "dcba";
		System.out.println(EditDistance(s, t));
	}
}
