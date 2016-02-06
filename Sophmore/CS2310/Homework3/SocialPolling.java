/*
 *Sydnee Wren
 *Due: June 30, 2015 
 *
 *SocialPolling.java
 *Program will prompt a random number of people (5 - 13) to rate 5 social
 *issues from 1 - 10. the program will then print out a table with the 
 *results, the average of each topic, the topic with the highest points
 *total, and the topic with the lowest points total.
 */

import java.util.Scanner;
import java.util.Random;

public class SocialPolling {
	public static void main(String[] args){
		String [] topics = { "Climate Change", "Marraige Equality", "Higher Education Cost", 
							 "Space Exploration Funding", "Self-Driving Cars"};
		int [][] results = new int[5][10];
		
		System.out.println("Please vote the following social and political topics.");

		questions(topics, results);
		printTable(topics, results);
		
	}
	
	public static void questions(String[] topics, int [][] results){
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int people = rand.nextInt(9)+5;
		
		int answer = 0;
		int count = 0; 
		
		System.out.println(people);
		
		while (count < people){
		for (int i = 0; i < topics.length; i++){
			System.out.print("Please rate " + topics[i] + " on a scale from 1 - 10(most important): ");
			answer = in.nextInt();
		}
		for (int i = 0; i < topics.length; i++){
			for (int j = 0; j < results[i].length; j++){
				if (answer - 1 == results[i][j]){
					results [i][j] += 1;
				}
			}
		}
		count++;
		System.out.println();
		}
	
		in.close();
	}
	public static void printTable(String[] topics, int [][] results){
		System.out.println();
		for (int i = 0; i < results.length; i++){
				System.out.print(topics [i] + "       ");			
			for (int j = 0; j < results[i].length; j++){
				
				System.out.printf("%4d", results[i][j]);
			}
			System.out.println();
		}
	} 
	public static void max(int [][] results){
		
	}
	public static void min (int [][] results){
		
	}
	
}
