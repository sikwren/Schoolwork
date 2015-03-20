/*Sydnee Wren
 * Homework #4: ICalledYou
 */
import java.util.*;//Import Scanner and Math Package

public class ICalledYou {
	public static void main(String[] args) {
		product();//calls methods
		System.out.println();
		max();
	}
	//Multiply two inputs
	public static void  product() {		
			Scanner in = new Scanner(System.in);
			System.out.println("Enter two numbers to recieve their product:");
			System.out.println("Please input the first number: ");
			double a = in.nextDouble();
			
			System.out.println("Please input the second number: ");
			double b = in.nextDouble();
	
			System.out.println("The product of these two numbers is " + a * b);
	}
	
	//Returns max of two inputs
	public static void max() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers to recieve the larger of the two:");
		System.out.println("Please input the first number: ");
		double a = in.nextDouble();
		
		System.out.println("Please input the second number: ");
		double b = in.nextDouble();
		
		System.out.println(Math.max(a,b) + " is the larger of the two numbers.");
		in.close();
	}
}

