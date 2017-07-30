import java.util.Scanner;

public class inttostring {
	public static String helper(int c)
	{switch(c){

	case 1:
		return"one";
	case 2:
		return"two";
	case 3:
		return"three";
	case 4:
		return"four";
	case 5:
		return"five";

	}
	return null;	
	}
	public static String inttowords (int a)
	{
		if (a<10)
			return helper(a);
		int num =a/10;
		int num1 =a% 10;
		String b=helper(num1);
		String c=inttowords(num);
		return c+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int a = s.nextInt();
		String output = inttowords(a);
		System.out.print(output);
	}
}