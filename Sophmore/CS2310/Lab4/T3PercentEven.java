
public class T3PercentEven {
	public static void main(String[] args){
		int [] array =  {6, 2 , 9, 11, 3};
		System.out.println(percentEven (array));
	}
	public static double percentEven (int [] array){
		double percent = 0.0;
		int even = 0;
		
		
		for (int i = 0; i < array.length; i++){
			if (array[i] % 2 == 0){
				even++;
			}
			
		}
		percent = (even / (double)array.length) * 100;
		return percent;
		
	}
}


