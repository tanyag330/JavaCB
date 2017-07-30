package text_process;

import java.util.Scanner;

public class pattern_matching {

	public static int Brute_Force_Algorithm(String str1, String str2){
		for(int i = 0; i <= str1.length()- str2.length(); i++){
			int j=0;
			while(j<str2.length() && str1.charAt(i+j)== str2.charAt(j)){
				j++;
			}
			if(j==str2.length()){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String str1 = s.next();
		System.out.println("Enter pattern");
		String str2 = s.next();
		int i = Brute_Force_Algorithm(str1, str2);
		System.out.println(i);
	}
}

