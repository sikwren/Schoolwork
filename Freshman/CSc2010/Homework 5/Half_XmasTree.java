/*Sydnee Wren
 * Homework 5
 */

import java.util.Scanner;//imports Scanner

public class Half_XmasTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Prompts user for tree height (number of rows)
		System.out.print("How tall would you like your Christamas tree to be? ");
		int rows = in.nextInt();
		
		for (int i = 1; i <= rows; i++) { //loop for rows
			for(int j = 1; j <= i; j++) { //loop for how many stars in a row
				System.out.print("*");
			}
			System.out.println(); 
		}
		System.out.println("Merry Half-Christmas!"); //prints a jolly holiday message at the bottom.
<<<<<<< HEAD

=======
	in.close();
>>>>>>> homework
	}

}
