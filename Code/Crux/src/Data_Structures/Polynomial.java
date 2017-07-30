package Data_Structures;

import java.util.ArrayList;

public class Polynomial {

	private ArrayList<PolyPair> degCoeff;
	private int degree;   // max degree of polynomial

	Polynomial(){
		degCoeff = new ArrayList<PolyPair>();
		degree = 0;
	}

	public int degree(){
		return degCoeff.get(degCoeff.size()-1).getDegree();
	}

	public void setCoefficient(int degree, int coeff){

		for(int i =0; i < degCoeff.size(); i++){
			PolyPair currentPair = degCoeff.get(i);
			if(currentPair.getDegree() == degree){
				currentPair.setCoeff(coeff);
				return;
			}
		}
		int pos = degCoeff.size() - 1;
		if(pos != -1){
			PolyPair currentPair = degCoeff.get(pos);
			while(pos >= 0 && degCoeff.get(pos).getDegree() > degree){
				currentPair = degCoeff.get(pos);
				pos--;

			}
		}
		PolyPair newPair = new PolyPair(degree,coeff);
		degCoeff.add(pos+1, newPair);
	}

	public void print(){
		for(int i = 0; i < degCoeff.size(); i++){
			PolyPair currentPair = degCoeff.get(i);
			System.out.print(currentPair.getCoeff()+"x"+currentPair.getDegree()+" + ");
		}
		System.out.println();
	}

	public Polynomial add(Polynomial p){

		int i =0;
		int j =0;
		PolyPair currentPair1;
		PolyPair currentPair2;

		Polynomial output = new Polynomial();
		int degree1,degree2,coeff1,coeff2;

		while(i < degCoeff.size() && j < p.degCoeff.size()){
			currentPair1 = degCoeff.get(i);
			currentPair2 = p.degCoeff.get(j);
			degree1 = currentPair1.getDegree();
			degree2 = currentPair2.getDegree();
			coeff1 = currentPair1.getCoeff();
			coeff2 = currentPair2.getCoeff();
			if( degree1 == degree2){
				output.setCoefficient(degree1, coeff1 + coeff2);
				i++;
				j++;
			}

			else if(degree1 < degree2){
				output.setCoefficient(degree1, coeff1);
				i++;
			}
			else{
				output.setCoefficient(degree2, coeff2);
				j++;
			}
		}
		while(i < degCoeff.size()){
			currentPair1 = degCoeff.get(i);
			degree1 = currentPair1.getDegree();
			coeff1 = currentPair1.getCoeff();
			output.setCoefficient(degree1, coeff1);
			i++;
		}

		while(j < p.degCoeff.size()){
			currentPair2 = p.degCoeff.get(j);
			degree2 = currentPair2.getDegree();
			coeff2 = currentPair2.getCoeff();
			output.setCoefficient(degree2, coeff2);
			j++;
		}

		return output;

	}

}
