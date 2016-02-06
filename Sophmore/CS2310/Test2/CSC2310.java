import java.util.Scanner;
import java.util.Random;

public class CSC2310 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		Student sydnee = new Student("Sydnee Wren");
		Student bob = new Student("Bob Johnson");
		
		double testScore1[] = new double[3];
		double testScore2[] = new double[3];
		
		for (int i = 0; i < testScore1.length; i++){
			testScore1[i] = rand.nextDouble() * 100.0 + 0.0;
		}
		
		for (int i = 0; i < testScore2.length; i++){
			testScore2[i] = rand.nextDouble() * 100.0 + 0.0;
		}
		
		sydnee.setTest(testScore1);
		bob.setTest(testScore2);
		
		System.out.println(sydnee);
		System.out.println(bob);
			
		in.close();
	}
}

