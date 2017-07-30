package Data_Structures;

public class PolyPair {

	private int degree;
	private int coeff;
	
	PolyPair(int degree, int coeff){
		this.degree = degree;
		this.coeff = coeff;
	}
	
	public void setDegree(int degree){
		this.degree = degree;
	}
	
	public void setCoeff(int coeff){
		this.coeff = coeff;
	}
	
	public int getDegree(){
		return degree;
	}
	
	public int getCoeff(){
		return coeff;
	}
}
