package Java;

import java.util.Scanner;

public class average_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println(" enter principle amount :");
		float principalamount = s.nextFloat();
		System.out.println(" enter rate :");
		float rate = s.nextFloat();
		System.out.println(" enter time :");
		float time = s.nextFloat();
		float interest = (principalamount * rate * time) / 100;
		System.out.println("simple interest is :" + interest);
		float amount = principalamount + interest;
		System.out.println("amount is :" + amount);

	}

}
