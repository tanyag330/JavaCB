import java.util.Scanner;
public class BinaryDecimal 
{
	public static void main(String args[])
	{
		int binary;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter binary number");
		binary=sc.nextInt();
int decimal = 0;
		int power = 0;
		while(true)
		{
			if(binary == 0)
			{
				break;
			} 
			else 
			{
				int tmp = binary%10;
				 decimal=(int) (decimal+ tmp*Math.pow(2, power));
				binary = binary/10;
				power++;
			}
		}
		System.out.println("decimal number is:" +decimal);
		
	}

}
