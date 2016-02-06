/*
 * Sydnee Wren
 * Due: July 17, 2015
 * 
 * Fraction.java (Class)
 * Add a divide, scale, scaleUp, and scaleUp to the Fraction class.
 * Add two more constructors, one with no parameters, and one with
 * just the numerator as the parameter. This class will be used in
 * the FractionScale.java program.
 */
public class Fraction {
	private int numerator;
	private int denominator;
	
	//constructors
	public Fraction(int num, int denom){
		numerator = num;
		denominator = denom;
	}
	
	public Fraction(){
		numerator = 0;
		denominator = 1;
	}
	
	public Fraction(int num){
		numerator = num;
		denominator = 1;
	}
	
	//instance methods
	public int getNumerator(){
		return numerator;
	}
	
	public int getDenominator(){
		return denominator;
	}
	
	public void scale(boolean flag, int factor){
		if (flag == true){
			if (factor == 0){
				System.out.println("Factor is 0. Scaling cannot occur.");
			} else {
			scaleUp(factor);
			}
		} else {
			if (factor == 0){
				System.out.println("Factor is 0. Scaling cannot occur.");
			} else {
			scaleDown(factor);
			}
		}
	}
	
	public void scaleUp(int factor){
		numerator *= factor;
	}
	
	public void scaleDown(int factor){
		denominator *= factor;
	}

	public Fraction add(Fraction f){
		int num = numerator * f.denominator +
				  f.numerator * f.denominator;
		int denom = denominator * f.denominator;
		return new Fraction (num, denom);
	}
	
	public Fraction divide(Fraction f){
		int num = numerator / f.denominator;
		int denom = denominator / f.numerator;
		return new Fraction (num, denom);
	}

	public String toString(){
		return numerator + "/" + denominator;	
	}
	
}
