package Java1;

public class binarydecimal {

	public int getDecimalFromBinary(int binary){

		int decimal = 0;
		int power = 0;
		while(true){
			if(binary == 0){
				break;
			} else {
				int tmp = binary%10;
				decimal += tmp*Math.pow(2, power);
				binary = binary/10;
				power++;
			}
		}
		return decimal;
	}

	public static void main(String args[]){
		binarydecimal bd = new binarydecimal();
		System.out.println("11 ===> "+bd.getDecimalFromBinary(11));
		System.out.println("110 ===> "+bd.getDecimalFromBinary(110));
		System.out.println("100110 ===> "+bd.getDecimalFromBinary(100110));
	}

}
