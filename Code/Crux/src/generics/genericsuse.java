package generics;

public class genericsuse {
	public static void bubblesort(int[] input)
	{
		int temp;
		for (int i=0;i<input.length;i++)
		{
			for(int j=0;j<input.length-i-1;j++)
			{
				if(input[j]>input[j+1])
				{
					temp=input[j+1];
					input[j+1]=input[j];
					input[j]=temp;
				}
			}
		}
	}
 
	public static void main(String args[]) {
    	pairs<Integer> p = new pairs<>();
    	pairs<pairs<Integer>> p1 = new pairs<>();
    	Student st[]= new Student[10];
    	for (int i=0;i<st.length;i++){
    		st[i] = new Student ();
    		st[i].price =100 -1;
    	}
    	bubblesort(st);
    	for (int i=0;i<st.length;i++){
    		System.out.print(st.marks);
    	
    	}
    }
}
