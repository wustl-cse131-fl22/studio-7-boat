package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction (int n, int d) {
		this.numerator =  n;
		this.denominator = d;
	}
	
	public int getNumerator () {
		return this.numerator;
	}
	
	public int getDenominator () {
		return this.denominator;
	}
	
	public Fraction add (Fraction f1, Fraction f2) {
		int n3 = f1.getNumerator()*f2.getDenominator() + f2.getNumerator()*f1.getDenominator();
		int d3 = f1.getDenominator() * f2.getDenominator();
		Fraction f3 = new Fraction (n3,d3);
		return f3;
	}
	
	public Fraction multiply (Fraction f1, Fraction f2) {
		int n3 = f1.getNumerator() * f2.getNumerator();
		int d3 = f1.getDenominator() * f2.getDenominator();
		Fraction f3 = new Fraction (n3,d3);
		return f3;
	}
	
	public Fraction reciprocal () {
		int n = this.getDenominator();
		int d = this.getNumerator();
		Fraction f = new Fraction (n,d);
		return f;
	}
	
	public Fraction simplify () {
		int gcd = GCD (this.getNumerator(),this.getDenominator());
		int n = this.getNumerator()/gcd;
		int d = this.getDenominator()/gcd;
		Fraction f = new Fraction (n,d);
		return f;
	}
	
	public int GCD (int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
}
