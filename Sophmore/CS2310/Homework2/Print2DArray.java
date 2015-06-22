/*
 * Sydnee Wren
 * 
 * Due: June 23, 2015
 * 
 * Print2DArray.java
 * User will input the dimensions for a multi-dimensional array.
 * The array will then be filled with a randomly generated number
 * (100 - 10000). The program will print the largest and smallest 
 * number along with the average of all the numbers in the array.
 */

import java.util.*;

public class Print2DArray {
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		Random rand = new Random();
		
		System.out.print("Enter the number of rows: ");
		int rows = in.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int columns = in.nextInt();
		
		System.out.println();
		System.out.println("   Sydnee Wren\t002-09-2535");
		System.out.println();
		
		int [][] numArray = new int [rows][columns];
		
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < columns; j++){
				numArray [i][j] = rand.nextInt(9100) + 100;
				System.out.printf("    %4d\t", (numArray [i][j]));
			}
			System.out.println();
		}
		int max = 0, min = 9999; double sum = 0;
		for (int i = 0; i < numArray.length; i++){
			for (int j = 0; j < numArray[i].length; j++){
				if (numArray[i][j] > max ){
					max = numArray[i][j];
				}
				
				for(int k= 0; k < numArray.length; k++){
	                 if (numArray[i][k] < min){
	                    min = numArray[i][k];
	                 }
				}
				sum += numArray[i][j];
			}
		}
		
		System.out.println();
		System.out.print("Maximum: " + max + "; Minimum: " + min +
				"; Average: " + sum/(rows * columns));
		
		in.close();
	}
}
