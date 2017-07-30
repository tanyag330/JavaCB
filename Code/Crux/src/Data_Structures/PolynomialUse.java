package Data_Structures;

public class PolynomialUse {

	public static void main(String[] args) {
		Polynomial p1 = new Polynomial();
		p1.setCoefficient(0, 1);
		p1.setCoefficient(2, 3);
		p1.setCoefficient(4, 5);
		p1.print();
		Polynomial p2 = new Polynomial();
		p2.setCoefficient(0, 1);
		p2.setCoefficient(2, 4);
		p2.setCoefficient(1, 2);
		p2.print();
		Polynomial p3 = p1.add(p2);
		p3.print();

	}

}
