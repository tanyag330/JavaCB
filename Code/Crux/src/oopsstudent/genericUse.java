package oopsstudent;

import generics.pairs;


public class genericUse {
	public static<T extends Comparable> void bubblesort(T[] input)
	{
		T temp;
		for (int i=0;i<input.length;i++)
		{
			for(int j=0;j<input.length-i-1;j++)
			{
				if(input[j].compareTo(input[j+1])==1)
				{
					temp=input[j+1];
					input[j+1]=input[j];
					input[j]=temp;
				}
			}
		}
	}

	public static void main(String args[]) {
		Student st[]= new Student[10];
		for (int i=0;i<st.length;i++)
		{
			st[i] = new Student();
			st[i].marks =100 -i;
		}
		bubblesort(st);
		for (int i=0;i<st.length;i++){
			System.out.println(st[i].marks);

		}
	}
}
