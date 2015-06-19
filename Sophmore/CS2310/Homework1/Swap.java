/*
 * Sydnee Wren
 * Due June 16, 2015
 * 
 * Swap.java
 * 
 * User will input an integer and the program will print the integer back 
 * where pairs of digits within that integer have switched. The user will 
 * then enter a string of letters. The program will print the string with 
 * the same encryption. 
 */
import java.util.Scanner;

public class Swap {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please input a number to be swapped: ");
		int number = in.nextInt();
		swapDigitPairs(number);
		
		System.out.print("Please input a string to be swapped: ");
		String swap = in.next();
		swapLetterPairs(swap);
		
		in.close();
	}
	
	public static void swapDigitPairs(int number){
		int result = 0;		//empty variable to "transfer" results from number variable
		int place = 1;		//variable for digit's place value
		
		while (number > 9){	//loop will con't to execute as long as number has two or more digits
			result += place * 10 * (number % 10);
			number /= 10; 	//number = number with out the previous place value
			result += place * (number % 10); //digit from first value place
			number /= 10;
			place *= 100;
		}
		System.out.println(result + place * number);
	}
	
	public static void swapLetterPairs(String swap){
		char [] result = swap.toCharArray();	//converts string to char array
	
		for (int i = result.length - 1; i > 0; i -= 2){
			char temp = result[i];
			result [i] = result [i - 1];
			result [i - 1] = temp;
		}
		System.out.println(new String (result));	//converts char array to new string, output to console
	}
}
