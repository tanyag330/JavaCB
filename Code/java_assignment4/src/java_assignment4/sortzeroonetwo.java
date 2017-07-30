import java.util.Scanner;
public class sortzeroonetwo 
{
	public static int[] takeInput()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int size = s.nextInt();
		int input[] = new int[size];
		System.out.println("Enter Array ");
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;	
	}
	public static void printArray(int[] input)
	{
		for(int i = 0; i < input.length; i++)
		{
			System.out.print(input[i]+" ");
		}
	}
	public static void sortzerotwo(int[] input)
	{
		int nextzero=0;
		int nexttwo=input.length-1;
		int temp;
		int i=0;
		int temp1;
		while(i<=nexttwo)
		{
			if(input[i]==0)
			{
				temp=input[nextzero];
				input[nextzero]=input[i];
				input[i]=temp;
				nextzero++;
				i++;
			}
			else if(input[i]==2)
			{
				temp1=input[nexttwo];
				input[nexttwo]=input[i];
				input[i]=temp1;
				nexttwo--;
			}
			else
			{
				i++;
			}
		}
}
public static void main(String args[])
{
	int[] input=takeInput();
	sortzerotwo(input);
	printArray(input);

}
}