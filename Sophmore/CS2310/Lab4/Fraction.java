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
			scaleUp(factor);
		} else {
			scaleDown(factor);
		}
		
	}
	public void scaleUp(int factor){
		if (factor == 0){
			System.out.println("No scaling can occur. Factor is 0.");
		}
		numerator += factor;
	}
	
	public void scaleDown(int factor){
		numerator -= factor;
	}

	public Fraction add(Fraction f){
		int num = numerator * f.denominator +
				  f.numerator * f.denominator;
		int denom = denominator * denominator;
		return new Fraction (num, denom);
	}
	public Fraction subtract(Fraction f){
		int num = numerator * f.denominator -
				  f.numerator * denominator;
		int denom = denominator * f.denominator;
		return new Fraction (num, denom);
	}
	
	public Fraction divide(Fraction f){
		int num = numerator * f.denominator;
		int denom = denominator * f.numerator;
		return new Fraction (num, denom);
	}
	
	public Fraction multiply(Fraction f){
		int num = numerator * f.numerator;
		int denom = denominator * f.denominator;
		return new Fraction(num, denom);
	}

	public String toString(){
		return numerator + "/" + denominator;	
	}
	
}

