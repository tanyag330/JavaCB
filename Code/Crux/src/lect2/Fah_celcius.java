package lecture2;

public class Fahr_celcius {

	public static void main(String[] args) {
		int celcius,fah=0;
		while(fah<=300)
		{
			celcius=5*(fah-32)/9;
			System.out.println(fah + "\t"+ celcius);
			fah=fah+20;
		}
		

	}

}
