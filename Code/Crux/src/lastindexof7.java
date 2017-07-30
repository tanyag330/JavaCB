package Java;

public class lastindexof7 {
	public static int check_7(int[] input,int beginindex)
	{
		//int n=input.length;
		if (beginindex<=0)
		{
			return -1;
		}
		if (input[beginindex]==7)
		{
			return beginindex;
		}

		return check_7(input ,beginindex-1 );
	}

	public static void main(String[] args) {
		int [] input= { 1, 2 , 7,5};
		int check_7= check_7(input,input.length-1);
		System.out.println(check_7);
	}

}

