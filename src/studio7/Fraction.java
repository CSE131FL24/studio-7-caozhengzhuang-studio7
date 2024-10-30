package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	
	public Fraction (int numerator, int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public int getDenominator() {
		return this.denominator;
	}
	
	
	
	public Fraction Add(Fraction frac2) {
		int n2 = frac2.getNumerator();
		int d2 = frac2.getDenominator();
		int n1 = this.numerator;
		int d1 = this.denominator;
		int d3 = d1 * d2;
		int n3 = n1*d2 + n2* d1;
		Fraction newFrac = new Fraction(n3, d3);
		return newFrac;
	}
	
	
	public Fraction Multiply(Fraction frac2) {
		int n2 = frac2.getNumerator();
		int d2 = frac2.getDenominator();
		int n1 = this.numerator;
		int d1 = this.denominator;
		int d3 = d1 * d2;
		int n3= n1 * n2;
		Fraction newFrac = new Fraction(n3, d3);
		return newFrac;
	}
	
	public Fraction Reciprocal() {
		int newD = this.numerator;
		int newN = this.denominator;
		Fraction newFrac = new Fraction(newN, newD);
		return newFrac;
		
	}
	
	
	public Fraction LeastCommonMultiple(Fraction frac2) {
		int 
	}
	
	public String toString() {
		String result = "The fraction is " + this.numerator + "/";
		result += this.denominator + ".";
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction frac1 = new Fraction(1, 2);
		Fraction frac2 = new Fraction(3, 5); 
		Fraction fracSum = frac1.Add(frac2);
		System.out.println(fracSum.toString());
		Fraction fracProduct = frac1.Multiply(frac2);
		System.out.println(fracProduct.toString());
	}

}
