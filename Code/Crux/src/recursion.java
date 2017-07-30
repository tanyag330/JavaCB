package Java1;

public class recursion {
	public static int factorial(int n){
		if(n == 0){
			return 1;
		}
		return n*factorial(n-1);
	}


	public static int fib(int n){
		if(n==1 || n==2){
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}

	public static int power(int x, int n){
		if(n==0){
			return 1;
		}
		return x*power(x, n-1);
	}

	public static boolean checkSorted(int[] input){
		int n = input.length;
		if(n==1 || n==0){
			return true;
		}
		if(input[0] > input[1]){
			return false;
		}
		int smallInput[] = new int[n-1];
		for(int i = 1; i < n; i++){
			smallInput[i-1] = input[i];
		}
		//	boolean smallOutput = 
		return checkSorted(smallInput);
	}
	// check sorted from beginIndex to End
	public static boolean checkSorted_1(int[] input,int beginIndex){
		if(beginIndex >= input.length-1){
			return true;
		}
		if(input[beginIndex] > input[beginIndex+1]){
			return false;
		}

		return checkSorted_1(input,beginIndex+1);
	}



	public static void main(String args[]){
		int number =6;
		//	System.out.println(factorial(number));
		System.out.println(number +"th term is :"+ fib(number));


		int input[] = {1,4,2,3};
		/*boolean result = checkSorted_1(input, 0);
		System.out.println(result);*/
		int[] output = new int[input.length];
		
		for(int i = 0; i < input.length; i++){
			output[i] = -1;
		}
		
	//	returnIndices7(input,0,output,outputIndex);
		
		

	}
}
