/*Sydnee Wren
 * Lab #7
 */
import java.util.Scanner;

public class forDigits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter value: ");
		int n = in.nextInt();
		int i;
		
		for (i = 0; n > 0; i++){
			n /= 10;
		}
		System.out.println("Number of digits: " + i);
		
		in.close();
	}

}
