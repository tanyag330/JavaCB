package Java;

import java.util.Scanner;

public class quadratic {
	
		public static void main(String[] args) 
		{

			Scanner s=new Scanner(System.in);  
			double a,b,c,quad_dis,quad_11,quad_1,quad_21,quad_2;  
			System.out.println("Enter the value of A");  
			a=s.nextDouble();  
			System.out.println("\nEnter the value of B");  
			b=s.nextDouble();
			System.out.println("\nEnter the value of C");
			c=s.nextDouble();
			quad_dis=b*b-4*a*c;
			quad_11=(-1*b)+(Math.sqrt(quad_dis));
			quad_1=quad_11/(2*a);
			quad_21=(-1*b)-(Math.sqrt(quad_dis));
			quad_2=quad_21/(2*a);
			{
				System.out.println("\nValues are: "+quad_1+", "+quad_2);
				if(quad_dis>0)
				{
					System.out.println("\nThe roots are REAL and DISTINCT");
				}
				else if(quad_dis==0)
				{
					System.out.println("\nThe roots are REAL and EQUAL");
				}
				else
				{
					System.out.println("\nThe roots are IMAGINARY");
				}	

			}
			s.close();
		}
	}

