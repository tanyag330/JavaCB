package Java;

public class allindeceso {

	public static int[] returnindeces(int[] input,int beginindex,int[] output, int [] smalloutput)
	{
		int n=input.length;
		smalloutput[] = new int [n-1];
		for (int i=1; i<n; i++)
		{	
			if (input[beginindex]==7)
			output[i] = smalloutput[i+1];
		}
		return returnindeces(input,beginindex+1,output,smalloutput);
	}
	public static void main(String[] args) {
		int [] input= { 1, 3 ,8 ,5};
		int [] output = new int [input.length];
		for (int i=0; i<input.length; i++)
		{
			output[i]=-1;
		}
		/*int[] outputindex;
		for (outputindex=0; outputindex<input.length; outputindex++)
		{
			System.out.println("outputindex");
	
		}*/
		int [] smalloutput =returnindeces(input,0,output,smalloutput);
		
//		returnindeces(input,0,output,outputindex);
//		System.out.println(returnindeces(input, outputindex, null, output));

	}

}
