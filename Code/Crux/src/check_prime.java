package Java;

import java.util.Scanner;



public class check_prime {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = s.nextInt();
		int divisor = 2;
		while(divisor < num){
			if(num % divisor == 0){
				System.out.println("Not Prime");
				break;
			}
			divisor++;
		}
		if(divisor == num){
			System.out.println("Prime");

		}
		
		int i = 4;
		while(i == 2){
			System.out.println("Inside while");
			i++;
		}
		System.out.println("Outside while");
		
	}

}
