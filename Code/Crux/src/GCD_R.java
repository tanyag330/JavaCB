package Java1;

import java.util.Scanner;

public class GCD_R {
	public static int getGcd(int a, int b)
	{
	    int gcd = 1;

	    if(a>b)
	    {
	        for(int i = b; i >=1; i--)
	        {
	            if(a%i==0 && b%i ==0)
	            {
	                return i;
	            }
	        }
	    }
	    else
	    {
	        for(int j = a; j >=1; j--)
	        {
	            if(a%j==0 && b% j==0)
	            {
	                return j;
	            }
	        }
	    }   
	    return gcd;

	}
	public static void  main(String [] args)
	{
	    Scanner input = new Scanner(System.in);
	    System.out.println("Please enter the first integer:");
	    int a = input.nextInt();
	    System.out.println("Please enter the second integer:");
	    int b = input.nextInt();

	    System.out.println("The GCD of " + a + " and " + b + " is " +  getGcd(a,b) + ".");
	}

}
