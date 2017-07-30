package Java;

public class check_7 {
	public static boolean check_7(int[] input)
	{
		int n=input.length;
		if (n==0)
			{
			return false;
			}

		if (input[0]==7)
		{
			return true;
		}
		int smallinput[] = new int [n-1];
		for (int i=1; i<n; i++)
		{
			smallinput[i-1] =input[i];
		}
		return check_7(smallinput);
	}
	public static void main(String[] args) {
		int [] input= { 1, 3 ,8 ,5};
		boolean check_7= check_7(input);
		System.out.println(check_7(input));
	}

}



