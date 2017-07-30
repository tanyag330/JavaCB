package Java;

public class rotatedarray {
	public static int rotatedarray(int [] input)
	{
		for (int i=0; i<input.length-1;i++)
		{
			if(input[i]>input[i+1]){
				return i+1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int [] input= { 4 , 5 , 1 , 2 ,3};
		int num=rotatedarray(input);
		System.out.print("position of rotation : " +num );
	}
}
