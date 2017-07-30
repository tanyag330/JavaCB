package assignments.ass2a;

public class notMultiplesOf4 {

	public static void main(String args[])
	{
		int n=1,number,NoOfTerms=1;
		while(NoOfTerms<=20)
		{
			number=3*n+2;
			if(number%4!=0)
			{
				NoOfTerms=NoOfTerms+1;
				System.out.println(number);
			}
			n=n+1;
		}
	}
}

