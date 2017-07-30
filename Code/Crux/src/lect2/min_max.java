package lect2;

import java.util.Scanner;

public class min_max {

	public static void main(String[] args) {
	int Num,max,min,c=1,N;
	Scanner scnr =new Scanner(System.in);
	System.out.println("Enter value of first number ");
	Num= scnr.nextInt();
	max=Num;
	min=max;
	while(c<=4)
	{
		System.out.println("Enter next value ");
		N=scnr.nextInt();
		if(N<min)
			min=N;
		if (N>max)
			max=N;
		c++;
	}
    System.out.println("Max value is "+ max +"\n"+"Min value is "+min);
	}

}
