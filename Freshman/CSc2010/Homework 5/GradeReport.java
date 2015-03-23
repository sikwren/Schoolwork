/*Sydnee Wren
 * Homework 5
 */

import java.util.Scanner;

public class GradeReport {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
	
		//user input
		System.out.print("Please enter your test grade (between 0 and 100): ");
		int grade = in.nextInt();
		int tries = 0;
		
		//error and tries
		do {
			if (grade < 0 || grade > 100) {
				System.out.println("Error! Please enter a grade between 0 and 100!");
				System.out.print("Please enter your test grade (between 0 and 100): ");
				grade = in.nextInt();
			}
			
			++tries;
			
		} while (tries < 2);
		
		//Prints grades
		 if (grade >= 0 || grade <= 100 ) {		
			 switch (grade/10){
			case 1:
				System.out.println("AN F!!!! You bring dishonor upon your family. Go study!");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
				System.out.println("Yikes! A C is too close failing. Crack open those notes and get some knowledge!");
				break;
			case 8:
				System.out.println("B's are no laughing matter! Still pretty good.");
				break;
			case 9:
				System.out.println("A! That's an awesome grade!");
				break;	
			case 10: 
				System.out.println("A+! That's a perfect score!");
				break;
			default: 
				System.out.println("Error!");	
			}
		in.close();
		}		
	}	
}


