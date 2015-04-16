import java.util.*;
public class swapAll {

	public static void main(String[] args) {
		int[] a1 ={11, 42, -5, 27, 0, 89};
		int[] a2 = {10, 20, 30, 40, 50, 60};
		
		swap(a1, a2);
		
	}
	
	public static void swap(int[] a1, int[] a2){
		int[] temp = new int[6];
		
		for(int i = 0; i < a1.length; i++)
		{
			temp[i] = a1[i];
			a1[i] = a2[i];
			a2[i] = temp[i];
			
		}
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
	}
}

