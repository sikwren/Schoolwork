
public class Student {
	private String name;
	private double test1;
	private double test2;
	private double test3;
	
	public Student(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setTest(double t[]){
		test1 = t[0];
		test2 = t[1];
		test3 = t[2];
	}
	
	public String getLetterGrade(){
		String letter = "F";
		double average = (test1 + test2 + test3)/3;
		
		if (average >= 60){
			letter = "S";
		}
		return letter;
	}
	
	public double getBestScore(){
		if (test1 > test2 && test1 >test3 ){
			return test1;
		} else if (test2 > test1 && test2 >test3){
			return test2;
		} else {
			return test3;
		}
	}
	
	public String toString(){
		return name + "'s score is " + getLetterGrade() + "\t Best Score: " + getBestScore();
	}
}
