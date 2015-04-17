//Sydnee Wren
//Homework #8
import java.util.Scanner;

public class SwagNArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] numbers = new int[10];//length of index
		
		for (int i = 0; i <= numbers.length - 1; i++){ //for loop for array
			System.out.print("Please enter a number: ");
			numbers [i] = in.nextInt();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		}
	
		printReverse(numbers);
		compute(numbers);
		getLargest(numbers);
	
		in.close();
	}
	
	public static void printReverse(int[] numbers){ //method prints array in reverse
		System.out.println("Here are your numbers in reverse: ");
		for (int i = numbers.length-1; i >= 0 ; i--){
			System.out.print(numbers[i] + ", ");
		}
	}
	
	public static void compute(int[] numbers){ //method adds all array's values
		int solution = 0;
		for (int i = 0; i < numbers.length; i++){
			solution = solution + numbers[i];	
		}
		System.out.println("All numbers add up to " + solution + ".");
	}
	
	public static void getLargest(int[] numbers){ //method retrieves array's largest value
		int max = -9999;
		for(int i = 0; i < numbers.length; i++){
			if (numbers[i] > max){
				max = numbers[i];
			}
		}
		System.out.println("The highest number is " + max + ".");
	}

}
