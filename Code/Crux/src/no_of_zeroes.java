import java.util.Scanner;

public class no_of_zeroes {
	
	public static int noOfZeroes(int num) {
		int count =0;
	while(num>0){
		if(num%5>=1){
			num =num/5;
			count++;
		}
		num--;
	}
	return count;
	}
	public static void main(String args[])
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter num");
		num=s.nextInt();
		int a = noOfZeroes(num);
		System.out.println(a);
	}
}
