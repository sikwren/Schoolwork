/*Sydnee Wren
 * Homework 4: Payroll.java
 */

import java.util.*; //import Scanner package

public class payroll {
	public static void main (String[] args){
		
		Scanner in = new Scanner(System.in); //Calling Scanner Constructor
	
		//Employee's name
		System.out.print("Please enter your full name:");
		String name = in.nextLine();
		
		//Hours worked
		System.out.print("Please enter the number of hours worked:");
		Double workedHours = in.nextDouble();
		
		//Hourly wage
		System.out.print("Please enter your hourly rate:");
		Double hourlyRate = in.nextDouble();
		
		//Federal Tax Rate
		System.out.print("Please enter the federal tax rate:");
		Double taxRate = in.nextDouble();
		
		//Gross pay
		Double grossPay = workedHours * hourlyRate;
		
		//Net pay	
		Double deducted = grossPay * taxRate;
		Double netPay = grossPay - deducted;
	
		
		//Output
		System.out.println();//Seperate input from output
		System.out.println("Employee's full name:		" + name);
		System.out.println("Number of hours worked:		" + workedHours);
		System.out.println("Your Hourly wage:		" + hourlyRate);
		System.out.println("Your Gross Pay:			" + grossPay);
		System.out.println("Your Deducted Pay:		" + deducted);
		System.out.println("Your Net pay:			" + netPay);
	}
}