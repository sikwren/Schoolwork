
public class FracTest {
	public static void main (String [] args){
		Fraction f1 = new Fraction(3, 5);
		Fraction f2 = new Fraction(5, 6);
		
		Fraction newFraction = f1.subtract(f2);
		Fraction newFraction2 = f1.multiply(f2);
		
		System.out.println(newFraction.getNumerator() + "/" + newFraction.getDenominator());
		System.out.println(newFraction2.getNumerator() + "/" + newFraction2.getDenominator());
	}
}
