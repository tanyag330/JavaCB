package Java;

public class allindecesof7 {
	/*public static int numOf(int number, int[]a) {
		int count=0;


		if(a.length > 0)
		{int value=a[0];
		int a1[]=new int [a.length-1];

		if(number==value)
			count=1;

		for(int i=1;i<a.length;i++){
			a1[i-1]=a[i];
		}

		return count+numOf(number,a1);
		}

		else
			return 0;

	}*/
	/*public static int numOf(int number, int[]input) {
		int index = 0;
		int count = 0;
		if(input.length > 0) {
			if(index < input.length) {
				if(number == input[index]) {
					count+= +1;
					index+= +1;
					return  count + index + numOf(number, input);
				}else{
					index += +1;
					return  count + index + numOf(number, input);
				}
			}else{
				return count;
			}
		}else
			return 0;
	}*/

	/*public static int returnindeces(int[] input,int inputindex,int[] output, int outputindex)
	{
		if (input[inputindex]==7)
		{
			output[outputindex] = input[inputindex];
			for (outputindex=0; outputindex<input.length; outputindex++)
			{	
				output[outputindex]=-1;	
			}
		}
		return returnindeces (input,inputindex+1,output,outputindex+1);	
	}*/
	public static void main(String[] args)
	{
		int [] input= { 1, 7 ,7 ,4};
		int number =7;
		int check_7= numOf(number, input);
		System.out.println(check_7);
		/*int [] output = new int [input.length];

		for (int i=0; i<input.length; i++)
		{	
			output[i]=-1;	
		}
		returnindeces(input,0,output,0);
		System.out.println();
		int check_7= returnindeces(input,0,output,0);
		System.out.println(check_7);
		 */
	}


}
