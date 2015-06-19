/*
 * Sydnee Wren
 * Due June 16, 2015
 * 
 * ChrisTree.java
 * The user will be prompted to enter the number of segments, and 
 * then the number of lines within each segment. A "Christmas Tree"
 * will be printed.
 */
import java.util.Scanner;

public class ChrisTree{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter height: ");
		int height = in.nextInt();
		
		System.out.print("Please enter number of segments: ");
		int segment = in.nextInt();
		
		drawChristmasTree(segment, height);
		
		in.close();
	} //end of main

   public static void drawChristmasTree(int segments, int height) {
       int dots = 0;
	   for (int segs = 1; segs <= segments; segs++) {
           for (int line = 1; line <= height; line++) {
               for (int spaces = 0; spaces < ((segments - segs) + (height - line)); spaces++) {
                   System.out.print(" ");
               }
               for (dots = 0; dots < ((2 * line - 1) + 2*(segs - 1)); dots++) {
                   System.out.print("*");
               }
               System.out.println();
           }
       }
       drawTrunk(height, dots);
   } //end of drawChristmasTree
   
   	public static void drawTrunk(int height, int dots){
   		int count = 0;
	   
   		while(count < 2){
   			for (int i = 0; i < dots / 2; i++){
   				System.out.print(" ");
   			}
   			System.out.println("*");
	   
   			count++;
   		}
	   
   		for (int i = 0; i < dots; i++){
   			System.out.print("*");	
	   } 
   	} //end of drawTrunk

}

