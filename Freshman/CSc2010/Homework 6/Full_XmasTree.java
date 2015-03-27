/*Sydnee Wren
 * Homework 6
 */

import java.util.Scanner;//import Scanner

public class Full_XmasTree {
	public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
	
	 System.out.print("How tall would you like your tree to be? ");//prompts user input
	 int columns = in.nextInt();//UI set to variable
		
	 for (int i = 0; i < columns; i++){ //controls lines
		
		 for(int j = columns ; j > i; j--){ //controls spaces; spaces go down as stars go up
				System.out.print(" ");
			}
			
			for (int k = 1; k < i + 1; k++) {//control stars; 
				System.out.print("* ");
			}
		System.out.println(); 
	}
	in.close();
	}
}
