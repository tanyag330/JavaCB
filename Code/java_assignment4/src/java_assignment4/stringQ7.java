
	import java.util.Scanner;

	public class stringQ7 {
		public static int[] takeInput(){
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


		public static void sortzeroonestwo(int input[]){
			int nextzero=0;
			int nexttwo=input.length-1;
			int temp;
			int temp1;
			int i=0;
			while (i<=nexttwo)
			{
				if (input [i]==0){
					temp=input[nextzero];
					input[nextzero]=input[i];
					input[i]= temp;
					nextzero++;
				}
				
					else if (input[i]==2){
						temp1=input[nexttwo];
						input[nexttwo]=input[i];
						input[i]= temp1;
						nexttwo--;
				}
					else {
						i++;
					}
			}
			}
		
			public static void printArray(int[] arr){
				for(int i = 0; i < arr.length; i++){
					System.out.print(arr[i]+" ");
				}
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] input = takeInput();
			sortzeroonestwo(input);
			printArray(input);
			}
		

	}


