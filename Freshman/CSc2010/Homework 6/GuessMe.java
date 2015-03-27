/* Sydnee Wren
 * Homework #6
 */

import java.util.Scanner; //import Scanner
import java.util.Random; //import Random

public class GuessMe {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		int number = rand.nextInt(100) + 1; //output randomize number 1 - 100	
		
		System.out.println("Welcome to my guessing game! "
				+ "Here, at this very moment, you will battle it out with me to guess the correct number!");
		
		System.out.print("Please enter your guess (1-100): ");
		int guess = in.nextInt(); //user guess
		int tries = 2; //user guesses
		
		do {
			if (guess > number) {
				System.out.print("Woah bro! That's a tad bit too high! ");
				System.out.print("Please enter your guess again: ");
				guess = in.nextInt();
				}
			
			if (guess < number) {
				System.out.print("Try a little higher this time! Just a bit too low this time! ");
				System.out.print("Please enter your guess again: ");
				guess = in.nextInt();
				
			} if (guess == number) {
				winner(number, tries); //calls winner method	
				return;
			} 
			++tries;
			
		} while (tries < 9);
		
		while (tries == 9){
			loser(tries, number); //calls loser method
			break;
		}
	}
	
	public static void winner(int number, int tries) {
		System.out.print("Aw man! You guessed my number correctly! ");
		System.out.println("The number was: " + number);
		System.out.println("It took you " + tries + " tries to guess the correct number." );
	}
	
	public static void loser(int tries, int number){
		System.out.println("Sorry bro, you didn't get the guess right at all!");
		System.out.println("My guess was " + number + ". Better luck next time!");	
	}

}
