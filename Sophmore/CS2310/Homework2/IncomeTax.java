/*
 * Sydnee Wren
 * 
 * Due: June 23, 2015
 * 
 * IncomeTax.java
 * User will input the income for the an amount of randomly generated
 * people (1 - 15). The taxes of each person will be printed along with the
 * largest amount of taxes out of all the incomes.
 */
import java.util.*;

public class IncomeTax {
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		Random rand = new Random();
		
		int people = rand.nextInt(15) + 1;
		System.out.println(people);
		
		double [] income = new double [people];
		
		for (int i = 0; i < people; i++){
			System.out.print("Please enter income: ");
			income [i] = in.nextDouble();
		}
		
		double [] taxes = new double [income.length];
		
		for (int i = 0; i < income.length; i++){
			if (income[i] < 750){
				taxes [i] = income [i] * 0.01;
				System.out.println(taxes[i]);
			
			}else if(income [i] >= 750 && income [i] < 2500){
				taxes [i] = (income [i] - 750) * 0.02 + 7.50;
				System.out.println(taxes[i]);
			
			}else if(income [i] >= 2500 && income [i] < 5000){
				taxes [i] = (income [i] - 2500) * 0.04 + 82.50;
				System.out.println(taxes[i]);
			
			}else if (income [i] >= 5000 && income[i] < 8000){
				taxes [i] = (income[i] -5000) * 0.05 + 142.50;
				System.out.println(taxes[i]);
			
			}else{
				taxes [i] = (income [i] - 8000) + 0.06+ 230.00;
				System.out.println(taxes[i]);
			}
		}
			
		double max = 0;
		for (int i = 0; i < taxes.length; i++){
			if (taxes[i] > max){
				max = taxes[i];
			}	
		}
		System.out.println("The largest amount of taxes: " + max);	
			
		in.close();
		}
}

