package lect2;

import java.util.Scanner;

public class pattern_1 {

	public static void main(String[] args) {
		int Nrows,value,row,col;
		row=1;
		value=1;
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter No of rows ");
		Nrows = scnr.nextInt();
		while(row<=Nrows)
		{
			col=1;
			while(col<=row)
			{
				System.out.print(value+" ");
				col=col+1;
				value=value+1;
			}
			row=row+1;
			System.out.print("\n");
		}
	}

}
