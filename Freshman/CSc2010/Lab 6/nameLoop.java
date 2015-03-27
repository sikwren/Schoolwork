
public class nameLoop {

	public static void main(String[] args) {
		name();
		age();
	}
	
	//prints name 20x
	public static void name() {
		String name = "Sydnee";
		for (int i = 1; i <= 20; i++) {
			System.out.println(name);		
		}
	}
	//prints age from 1 to 18
	public static void age() {
		for (int age = 1; age <= 18; age++) {
			System.out.println(age);	
		}
	}
}
