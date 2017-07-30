package Java;

public class checkifarraycontains7 {
	public static boolean check_7(int[] input,int beginindex)
	{
		int n=input.length;
		if (beginindex>=n)
			{
			return false;
			}

		if (input[beginindex]==7)
		{
			return true;
		}
		return check_7(input ,beginindex+1 );
	}
	public static void main(String[] args) {
		int [] input= { 1, 3 , 7 ,5};
		boolean check_7= check_7(input,0);
		System.out.println(check_7(input,0));
	}

}
