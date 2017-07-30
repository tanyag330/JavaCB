package Java;

public class firstindexof7 {

	public static int check_7(int[] input,int beginindex)
	{
		int n=input.length;
		if (beginindex>=n)
		{
		return -1;
		}

		
		if (input[beginindex]==7)
			{
			return beginindex;
			}

		
		return check_7(input ,beginindex+1 );
	}
	public static void main(String[] args) {
		int [] input= { 1, 3 , 5 ,4};
		int check_7= check_7(input,0);
		System.out.println(check_7);
	}

}

