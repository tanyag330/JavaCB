package lect2;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		int Nrows,value,row,col;
		row=1;
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter No of rows ");
		Nrows = scnr.nextInt();
		while(row<=Nrows)
		{
			col=1;
			while(col<=Nrows-row)
			{
				System.out.print(" ");
				col=col+1;
			}
			col=1;
			value=row;
			while(col<=row)
			{
				System.out.print(value +" ");
				value=value+1;
				col=col+1;
			}
			col=1;
			value=value-2;
			while(col<=row-1)
			{
				System.out.print(value + " ");
				value=value-1;
				col=col+1;
			}
			row=row+1;
			System.out.println();
		}
	}

}
