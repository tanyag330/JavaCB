package rec2;

public class codeQ5 {


	private static char codeHelper(int n) {
		return (char) (96+n);
	}


	public static String[] returncodes(int input){
		String[] output;
		if(input==0){
			output =new String [1];
			output[0]=" ";
			return output;
		}
		int lastdigit=input%10;
		char lastdigitcharacter= codeHelper(lastdigit);
		String smalloutput[] = returncodes(input/10);

		String[] smalloutput2=returncodes(input/100); ;
		char lasttwodigitcharacter = 0;
		int lasttwodigits=input%100;
		if(lasttwodigits>=10 && lasttwodigits<=26)
		{
			lasttwodigitcharacter= codeHelper(lasttwodigits);
			//	smalloutput2 = returncodes(input/100);
		}
		output  = new String [smalloutput.length + smalloutput2.length ];
		int k=0;
		for(k=0; k< output.length; k++)
		{
			for(String s:smalloutput)
			{
				output[k]= s + lastdigitcharacter;
				k++;
			}
			for(String s:smalloutput2)
			{
				output[k]= s + lasttwodigitcharacter;
				k++;
			}
		}
		return output;
	}

	public static void main (String args[]){
		int n = 1123;
		String [] output = returncodes(n);
		for (String s : output){
			System.out.print(s);
		}
	}
}
