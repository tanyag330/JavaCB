package Java;

public class interviewbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
	        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
	        for (int i = 0; i < A.size(); i++) {
	            B.add(new ArrayList<Integer>());
	        
	            for (int j = 0; j < A.get(i).size(); j++) {
	                B.get(i).add(0);
	            }

	            for (int j = 0; j < A.get(i).size(); j++) {
	                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
	            }
	        }
	        return B;
	}
	}

}
