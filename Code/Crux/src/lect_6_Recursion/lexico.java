package lect_6_Recursion;

public class lexico {

	public static void main(String[] args) {
		for(int i=1;i<10;i++)
		{
		   lexico(i);	
		}

	}
	public static void lexico(int num)
	{
		if(num>1000)
		{
			return;
		}
		
		System.out.println(num);
		for(int i=0;i<10;i++)
		{
		  lexico(num*10+i);
		  
		}
		
	}

}
