
import java.util.Scanner;


public class ArrayUse {

	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int size = s.nextInt();
		int input[] = new int[size];
		System.out.println("Enter Array ");
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		s.close();
		return input;	
	}


	public static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	int[] input1 = new int[5];
		//input1[0] = 1;

		//	int[] input1 = {1,2,3,4,5};
		//	input1 = {2,3,4,5,6}; 

		//	Scanner s1 = new Scanner(System.in);
		//String a = s1.next();
		int[] input = takeInput();
		printArray(input);
	}

}
