package text_process;

public class edit_distance {

	public static int EditDistance(String s ,String t){
		int m = s.length();
		int n = t.length();
		int [][] output = new int [m+1][n+1];
		for (int i =0; i<m; i++){
			for (int j =0; j<n; j++){
				output[i][j]=-1;
			}
		}
		return EditDistanceHelper(s, t, output);
	}
	public static int EditDistanceHelper(String s ,String t , int [][] output ){
		int m = s.length();
		int n = t.length();
		if(m==0)
			return n;
		if(n==0)
			return m;
		if(m==0 && n==0)
			return 0;
		/*if (output[m][n]> -1){
			return output[m][n];
		}*/
		int answer;
		if (s.charAt(0)==t.charAt(0))
			answer = EditDistanceHelper(s.substring(1),t.substring(1),output);
		else
			answer = 1+ Math.min(EditDistanceHelper(s.substring(1),t.substring(1),output), 
					(Math.min(EditDistanceHelper(s.substring(1),t,output), EditDistanceHelper(s,t.substring(1),output))))	;
		output[m][n] = answer;
		return answer;
	}
	public static int EditDistanceIter(String s ,String t){
		int m = s.length();
		int n = t.length();
		if(m==0)
			return n;
		if(n==0)
			return m;
		int [][] answers = new int [m+1][n+1];
		for (int i =0; i<m+1; i++){
			for (int j =0; j<n+1; j++){
				if (s.charAt(i)==t.charAt(j))
					answers[i][j] = answers[i-1][j-1];
				else
					answers[i][j] = 1+ Math.min(answers[i-1][j-1],(Math.min (answers[i][j-1],answers[i-1][j])))	;
			}
		}
		return answers[m][n];
	}
	
	public static void main(String[] args) {
		String s= "abcd";
		String t= "dcba";
//		System.out.println(EditDistance(s, t));
		System.out.println(EditDistanceIter(s, t));
	}
}
