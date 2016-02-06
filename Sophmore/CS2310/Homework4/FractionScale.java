/*
 * Sydnee Wren
 * Due: July 10, 2015
 * 
 * FractionScale.java (Client Program)
 * Prompts the user to for a fraction and uses the 
 * scale method from my Fraction.java class.
 */
		
import java.util.Scanner;

public class FractionScale {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.print("Enter a Fraction: ");		//take fraction input from user
	
		String fraction = in.nextLine().trim();
		int slashIndex = fraction.indexOf("/");
		
		int num = Integer.parseInt(fraction.substring(0,slashIndex).trim());
		int denom = Integer.parseInt(fraction.substring(slashIndex + 1,fraction.length()).trim());
		Fraction f1 = new Fraction(num, denom);		//constructing fraction object
			
		System.out.print("Scale up or down (1: up, 0: down): ");
		boolean flag = false;
		if (in.nextInt() == 1){
			flag = true;
		}
		
		System.out.print("Enter a scale factor: ");
		int factor = in.nextInt();
		f1.scale(flag, factor);
		
		if (factor == 0){
			System.out.println("Fraction is " + f1);
		} else {
			System.out.print("Scale Fraction is: " + f1);
		}

		in.close();
	}

}
